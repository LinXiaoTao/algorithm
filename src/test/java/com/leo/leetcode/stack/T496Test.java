package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T496Test {

    @Test
    public void nextGreaterElement() {
        T496 t496 = new T496();
        Assert.assertArrayEquals(
                new int[]{-1, 3, -1},
                t496.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})
        );
        Assert.assertArrayEquals(
                new int[]{3, -1},
                t496.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})
        );
        Assert.assertArrayEquals(
                new int[]{7, 7, 7, 7, 7},
                t496.nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7})
        );
    }
}