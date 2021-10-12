package ru.job4j.oop;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, double birhday) {
        super(name, surname, education, birhday);
    }

    private int toothLocation;

    public Teeth extraction(Pacient pacient) {
        return new Teeth();
    }
}