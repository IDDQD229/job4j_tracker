package ru.job4j.oop;

public class Surgeon extends Doctor {

    private final double dateOfOperation;

    public Surgeon(String name, String surname, String education, double birhday, double dateOfReceipt, double dateOfOperation) {
        super(name, surname, education, birhday, dateOfReceipt);
        this.dateOfOperation = dateOfOperation;
    }

    public Eye operation(Pacient pacient) {
        return new Eye();

    }
}