package ru.job4j.oop.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        while (index < products.length - 1) {
            index++;
            products[index - 1] = products[index];

        }

        products[index] = null;
        return products;
    }
}