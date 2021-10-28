package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус может ехать");
    }

    @Override
    public void passenger(int passenger) {
        int places = 10;
        int placesLeft = places - passenger;
    }

    @Override
    public int refill(int fuel, int price) {
        price = fuel * price;
        return price;
    }
}
