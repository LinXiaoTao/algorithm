package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;


public class T189Test {

    @Test
    public void rotate() {
        T189 t189 = new T189();
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7};
        t189.rotate(result, 3);
        Assert.assertArrayEquals(
                new int[]{5, 6, 7, 1, 2, 3, 4},
                result
        );

        result = new int[]{-1, -100, 3, 99};
        t189.rotate(result, 2);
        Assert.assertArrayEquals(
                new int[]{3, 99, -1, -100},
                result
        );
    }

    @Test
    public void rotate1() {

        T189 t189 = new T189();
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7};
        t189.rotate1(result, 3);
        Assert.assertArrayEquals(
                new int[]{5, 6, 7, 1, 2, 3, 4},
                result
        );

        result = new int[]{-1, -100, 3, 99};
        t189.rotate1(result, 2);
        Assert.assertArrayEquals(
                new int[]{3, 99, -1, -100},
                result
        );
    }
}