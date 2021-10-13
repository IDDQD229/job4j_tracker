package ru.job4j.oop;

public class Doctor extends Profession {

    private final double dateOfReceipt;

    public Doctor(String name, String surname, String education, double birhday, double dateOfReceipt) {
        super(name, surname, education, birhday);
        this.dateOfReceipt = dateOfReceipt;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }

}


