package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Клас описывает работу банковского перевода, используя при этом паспортные данные и реквизиты
 *
 * @author Maxim Sobolev
 * @version 1.0
 */

public class BankService {
    /**
     * Поле содержащие всех пользователей системы с привязанными к ним
     * счетами осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя
     * и добавляет нового пользователя в систему
     *
     * @param user пользователь добавленный в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход пользователя
     * и удаляет его из системы
     *
     * @param user пользователь удаленный из системы
     */
    public void deleteUser(User user) {
        users.remove(user);
    }

    /**
     * Метод добавляет новый счет(аккаунт) к пользователю, а также проверяет,
     * что у пользователя еще нет счета
     *
     * @param passport номер паспорта пользователя
     * @param account  аккаунт пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if ((user != null) && !(users.get(user).contains(account))) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     *
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя если пользователь с таким номером паспорта есть
     * или null если пользователя с таким номером паспорта нет
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет(аккаунт) пользователя по реквизитам
     *
     * @param passport  номер паспорта пользователя
     * @param requisite реквизиты счета(аккаунта)
     * @return возвращает счет(аккаунт) если счет с такими реквизитами есть
     * или null если пользователя с такими реквизитами счета нет
     */
    public Account findByRequisite(String passport, String requisite) {
        User o = findByPassport(passport);
        if (o != null) {
            return users.get(o)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод перечисляет денежные средства с одного счета(аккаунта) на другой
     *
     * @param srcPassport   номер паспорта пользователя со счета которого будет происходить перевод
     * @param srcRequisite  реквизиты счета с которого производится перевод
     * @param destPassport  номер паспорта пользователя на счет которого будет происходить перевод
     * @param destRequisite номер счета на который производится перевод
     * @param amount        количество денежных средств
     * @return вернет true если перевод осуществится и false если условия для перевода не будут
     * соблюдены (счёт не найден или не хватает денежных средств на счёте srcAcc (с которого переводят))
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account dstAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && dstAcc != null && srcAcc.getBalance() >= amount) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            dstAcc.setBalance(dstAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}