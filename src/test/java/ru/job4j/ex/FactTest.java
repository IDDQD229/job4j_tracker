package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen0() {
       int rsl = Fact.calc (-1);
    }
    @Test
    public void whenNGreaterThen0() {
        int rsl = Fact.calc (1);
    }
}

