package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle schoolBus = new SchoolBus();

        Vehicle[] vehicles = new Vehicle[] {airplane, train, schoolBus};
        for (Vehicle i: vehicles) {
            i.move();
            i.fuel();
        }
    }
}
