package ru.job4j.oop;

public class Dentist extends Doctor {

    private final int toothLocation;

    public Dentist(String name, String surname, String education, double birhday, double dateOfReceipt, int toothLocation) {
        super(name, surname, education, birhday, dateOfReceipt);
        this.toothLocation = toothLocation;
    }

    public Teeth extraction(Pacient pacient) {
        return new Teeth();
    }
}