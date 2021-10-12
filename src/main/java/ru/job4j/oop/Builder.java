package ru.job4j.oop;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, double birhday) {
        super(name, surname, education, birhday);
    }

    private boolean statusConcrete;

    public Construction build(Builder builder) {
        return new Construction();

    }
}



