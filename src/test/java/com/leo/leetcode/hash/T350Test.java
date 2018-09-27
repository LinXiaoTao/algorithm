package com.leo.leetcode.hash;

import com.leo.leetcode.hash.T350;
import org.junit.Assert;
import org.junit.Test;

public class T350Test {

    @Test
    public void intersection() {

        T350 t350 = new T350();
        int[] num1 = new int[]{1, 2, 2, 1};
        int[] num2 = new int[]{2, 2};
        Assert.assertArrayEquals(new int[]{2, 2}, t350.intersect(num1, num2));

    }

    @Test
    public void intersection1() {

        T350 t350 = new T350();
        int[] num1 = new int[]{4, 9, 5};
        int[] num2 = new int[]{9, 4, 9, 8, 4};
        Assert.assertArrayEquals(new int[]{9, 4}, t350.intersect(num1, num2));

    }
}