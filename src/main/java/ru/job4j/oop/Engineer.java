package ru.job4j.oop;

public class Engineer extends Profession {

    private final String worker;

    public Engineer(String name, String surname, String education, double birhday, String worker) {
        super(name, surname, education, birhday);
        this.worker = worker;

    }

    public Worker repair(Worker worker) {
        return new Worker();
    }
}

