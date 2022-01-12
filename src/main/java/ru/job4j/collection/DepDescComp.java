package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> first = new ArrayList<>(Arrays.asList(o1.split("/")));
        List<String> second = new ArrayList<>(Arrays.asList(o2.split("/")));
        int rsl = second.get(0).compareTo(first.get(0));
        return (rsl == 0) ? o1.compareTo(o2) : rsl;
    }
}