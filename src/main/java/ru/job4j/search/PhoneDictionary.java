package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> findName = (n) -> n.getName().contains(key);
        Predicate<Person> findSurName = (s) -> s.getSurname().contains(key);
        Predicate<Person> findPhone = (p) -> p.getPhone().contains(key);
        Predicate<Person> findAdress = (a) -> a.getAddress().contains(key);
        Predicate<Person> combine = findName.or(findSurName).or(findPhone).or(findAdress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}