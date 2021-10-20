package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(){
        Item[] itemsWithoutNull = new Item[size];
        int count = 0;
        for (Item item : items) {
            if (item != null) {
                itemsWithoutNull[count] = item;
                count++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, count);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] findNames = new Item[size];
        int rsl = 0;
        for (Item name : items) {
            if (name != null && name.getName().equals(key)) {
                findNames[rsl] = name;
                rsl++;
            }
        }
        findNames = Arrays.copyOf(findNames,rsl);
        return findNames;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
