package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T167Test {

    @Test
    public void twoSum() {
        T167 t167 = new T167();
        Assert.assertArrayEquals(
                new int[]{1, 2},
                t167.twoSum(new int[]{2, 7, 11, 15}, 9)
        );
        Assert.assertArrayEquals(
                new int[]{1, 2},
                t167.twoSum1(new int[]{2, 7, 11, 15}, 9)
        );
    }
}