package ru.job4j.oop;

public class Builder extends Engineer {

    private final boolean statusConcrete;

    public Builder(String name, String surname, String education, double birhday, String worker, boolean statusConcrete) {
        super(name, surname, education, birhday, worker);
        this.statusConcrete = statusConcrete;
    }

    public Construction build(Builder builder) {
        return new Construction();

    }
}



