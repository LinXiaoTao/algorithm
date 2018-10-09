package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T739Test {

    @Test
    public void dailyTemperatures() {
        T739 t739 = new T739();
        Assert.assertArrayEquals(
                new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                t739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})
        );
    }
}