package com.leo.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T122Test {

    @Test
    public void maxProfit() {

        T122 t122 = new T122();

        Assert.assertEquals(
                7,
                t122.maxProfit(new int[]{7, 1, 5, 3, 6, 4})
        );

        Assert.assertEquals(
                4,
                t122.maxProfit(new int[]{1, 2, 3, 4, 5})
        );

        Assert.assertEquals(
                0,
                t122.maxProfit(new int[]{7, 6, 4, 3, 1})
        );

        Assert.assertEquals(
                7,
                t122.maxProfit(new int[]{6, 1, 3, 2, 4, 7})
        );

    }
}