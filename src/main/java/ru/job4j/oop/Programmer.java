package ru.job4j.oop;

public class Programmer extends Engineer {

    private final String progLang;

    public Programmer(String name, String surname, String education, double birhday, String worker, String progLang) {
        super(name, surname, education, birhday, worker);
        this.progLang = progLang;
    }

    public Project write(Programmer programmer) {
        return new Project();
    }
}
