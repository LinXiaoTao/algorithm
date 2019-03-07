package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T66Test {

    @Test
    public void plusOne() {
        T66 t66 = new T66();

        Assert.assertArrayEquals(
                new int[]{1},
                t66.plusOne(new int[]{0})
        );

        Assert.assertArrayEquals(
                new int[]{1, 2, 4},
                t66.plusOne(new int[]{1, 2, 3})
        );

        Assert.assertArrayEquals(
                new int[]{4, 3, 2, 2},
                t66.plusOne(new int[]{4, 3, 2, 1})
        );
    }
}