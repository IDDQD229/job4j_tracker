package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;

    }

    public static void main(String[] args) {
        Battery first = new Battery(30);
        Battery second = new Battery(70);
        System.out.println("Заряд первой баттареи: " + first.load + " Заряд второй баттареи: " + second.load);
        first.exchange(second);
        System.out.println("Заряд первой баттареи: " + first.load + " Заряд второй баттареи: " + second.load);
    }
}
