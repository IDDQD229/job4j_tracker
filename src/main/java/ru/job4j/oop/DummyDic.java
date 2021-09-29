package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвсетное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic one = new DummyDic();
        String say = one.engToRus("Horizon");
        System.out.println(say);
    }
}
