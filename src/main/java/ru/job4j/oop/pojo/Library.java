package ru.job4j.oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Azbuka", 33);
        Book second = new Book("Tales", 30);
        Book third = new Book("Clean code", 500);
        Book fourth = new Book("Harry Potter", 250);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (Book bo : books) {
            System.out.println("Название книги: " + bo.getName() + " Колличество страниц: " + bo.getNumberOfPages());

        }
        System.out.println("Книги с индексом 0 и 3 переставленны местами");
        books[0] = fourth;
        books[3] = first;
        for (Book bo : books) {
            System.out.println("Название книги: " + bo.getName() + " Колличество страниц: " + bo.getNumberOfPages());
        }
        System.out.println("Вывод книги с именем " + "Clean code");
        for (Book bo : books) {
            if ("Clean code".equals(bo.getName())) {
                System.out.println("Название книги: " + bo.getName() + " Колличество страниц: " + bo.getNumberOfPages());
            }
        }
    }
}
