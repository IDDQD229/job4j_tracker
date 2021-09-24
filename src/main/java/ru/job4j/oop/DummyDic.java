package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        return "Horizon";
    }

    public static void main(String[] args) {
        DummyDic one = new DummyDic();
        String say = one.engToRus();
        System.out.println("Неизвестное слово. " + say);
    }
}
