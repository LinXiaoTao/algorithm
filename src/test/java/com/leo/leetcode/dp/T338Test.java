package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T338Test {

    @Test
    public void countBits() {

        T338 t338 = new T338();
        Assert.assertArrayEquals(
                new int[]{0, 1, 1, 2, 1, 2},
                t338.countBits(5)
        );

    }
}