package com.leo.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T3Test {

    @Test
    public void findRepeatNumber() {
        T3 t3 = new T3();
        Assert.assertTrue(
                t3.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}) == 3
                        || t3.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}) == 2
        );
    }

    @Test
    public void findRepeatNumber1() {
        T3 t3 = new T3();
        Assert.assertTrue(
                t3.findRepeatNumber1(new int[]{2, 3, 1, 0, 2, 5, 3}) == 3
                        || t3.findRepeatNumber1(new int[]{2, 3, 1, 0, 2, 5, 3}) == 2
        );
    }
}