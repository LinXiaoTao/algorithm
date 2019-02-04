package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T605Test {

    @Test
    public void canPlaceFlowers() {
        T605 t605 = new T605();
        Assert.assertTrue(
                t605.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)
        );
        Assert.assertFalse(
                t605.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)
        );
        Assert.assertTrue(
                t605.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2)
        );
        Assert.assertFalse(
                t605.canPlaceFlowers(new int[]{0, 1, 0}, 1)
        );
        Assert.assertTrue(
                t605.canPlaceFlowers(new int[]{0}, 1)
        );
        Assert.assertFalse(
                t605.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2)
        );
        Assert.assertTrue(
                t605.canPlaceFlowers(new int[]{0, 1, 0, 1, 0, 1, 0, 0}, 1)
        );
    }
}