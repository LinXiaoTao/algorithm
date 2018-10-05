package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T11Test {

    @Test
    public void maxArea() {
        T11 t11 = new T11();
        Assert.assertEquals(
                49,
                t11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})
        );
        Assert.assertEquals(
                1,
                t11.maxArea(new int[]{1, 1})
        );
    }
}