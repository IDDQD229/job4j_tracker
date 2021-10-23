package ru.job4j.oop.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            System.out.println("Осталось спичек: " + count + ".");
            String player = turn ? "Первый игрок " : "Второй игрок ";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches == 1) {
                count--;
            } else if (matches == 2) {
                count = count - 2;
            } else if (matches == 3)
                count = count - 3;
        }

        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}