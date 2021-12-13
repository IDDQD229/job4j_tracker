package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(User user){
     users.remove(user);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if ((user != null) && !(users.get(user).contains(account))) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport))
                return user;
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User o = findByPassport(passport);
        if (o != null) {
            for (Account account : users.get(o)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account dstAcc = findByRequisite(destPassport, destRequisite);
        if ((srcAcc != null) && (dstAcc != null)) {
            double balanceSrc = srcAcc.getBalance();
            double balanceDst = dstAcc.getBalance();
            if (balanceSrc >= amount) {
                dstAcc.setBalance(balanceDst + amount);
                srcAcc.setBalance(balanceSrc - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}