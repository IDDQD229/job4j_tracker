package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;


public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when500to200then3() {
        double expected = 3;
        Point a = new Point(5, 0,0);
        Point b = new Point(2, 0,0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}