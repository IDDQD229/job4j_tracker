package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void ascending() {
        List<Item> items = Arrays.asList(
                new Item(1, "Ann"),
                new Item(2, "Cris"),
                new Item(3, "Boris")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "Ann"),
                new Item(3, "Boris"),
                new Item(2, "Cris")
        );
        assertThat(items, is(expected));

    }

    @Test
    public void descending() {
        List<Item> items = Arrays.asList(
                new Item(1, "Ann"),
                new Item(2, "Cris"),
                new Item(3, "Boris")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Cris"),
                new Item(3, "Boris"),
                new Item(1, "Ann")
        );
        assertThat(items, is(expected));

    }
}