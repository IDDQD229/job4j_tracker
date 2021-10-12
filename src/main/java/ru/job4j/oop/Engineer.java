package ru.job4j.oop;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, double birhday) {
        super(name, surname, education, birhday);

    }

    private String repairStatus;

    public Worker repair(Worker worker) {
        return new Worker();
    }
}

