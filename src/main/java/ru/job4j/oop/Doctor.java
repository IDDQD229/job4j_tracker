package ru.job4j.oop;

public class Doctor extends Profession {
    public Doctor(String name, String surname, String education, double birhday) {
        super(name, surname, education, birhday);
    }

    private double dateOfReceipt;

    public Diagnosis heal(Pacient pacient) {
        return new  Diagnosis();
    }

}


