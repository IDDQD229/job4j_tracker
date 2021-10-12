package ru.job4j.oop;

public class Programmer extends Engineer {
    public Programmer(String name, String surname, String education, double birhday) {
        super(name, surname, education, birhday);
    }

    private String progLang;

    public Project write(Programmer programmer) {
        return new Project();
    }
}
