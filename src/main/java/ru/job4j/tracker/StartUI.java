package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item first = new Item();
        Item second = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = first.getCreated().format(formatter);
        System.out.println("Текущие дата и время: " + currentDateTimeFormat);
        System.out.println(second);
    }
}
