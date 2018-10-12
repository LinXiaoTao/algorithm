package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T121Test {

    @Test
    public void maxProfit() {
        T121 t121 = new T121();
        Assert.assertEquals(
                5,
                t121.maxProfit(new int[]{7, 1, 5, 3, 6, 4})
        );
        Assert.assertEquals(
                0,
                t121.maxProfit(new int[]{7, 6, 4, 3, 1})
        );
    }
}