package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T413Test {

    @Test
    public void numberOfArithmeticSlices() {
        T413 t413 = new T413();
        Assert.assertEquals(
                3,
                t413.numberOfArithmeticSlices(new int[]{1, 2, 3, 4})
        );
        Assert.assertEquals(
                6,
                t413.numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5})
        );
        Assert.assertEquals(
                2,
                t413.numberOfArithmeticSlices(new int[]{1, 2, 3, 8, 9, 10})
        );
    }
}