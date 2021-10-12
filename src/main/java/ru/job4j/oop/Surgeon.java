package ru.job4j.oop;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, double birhday) {
        super(name, surname, education, birhday);
    }

    private double dateOfOperation;

    public Eye operation(Pacient pacient) {
        return new Eye();

    }
}