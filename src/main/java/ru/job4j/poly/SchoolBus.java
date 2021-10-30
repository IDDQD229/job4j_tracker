package ru.job4j.poly;

public class SchoolBus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по скоростным трассам.");
    }

    @Override
    public void fuel() {
        System.out.println(getClass().getSimpleName() + " заправляется бензином.");
    }
}
