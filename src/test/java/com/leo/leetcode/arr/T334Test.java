package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T334Test {

    @Test
    public void increasingTriplet() {

        T334 t334 = new T334();
        Assert.assertTrue(
                t334.increasingTriplet(new int[]{1, 2, 3, 4, 5})
        );

        Assert.assertFalse(
                t334.increasingTriplet(new int[]{5, 4, 3, 2, 1})
        );

    }
}