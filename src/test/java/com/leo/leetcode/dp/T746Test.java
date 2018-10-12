package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T746Test {

    @Test
    public void minCostClimbingStairs() {
        T746 t746 = new T746();
        Assert.assertEquals(
                15,
                t746.minCostClimbingStairs(new int[]{10, 15, 20})
        );
        Assert.assertEquals(
                6,
                t746.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})
        );
    }
}