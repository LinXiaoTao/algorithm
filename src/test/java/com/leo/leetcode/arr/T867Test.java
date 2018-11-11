package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T867Test {

    @Test
    public void transpose() {
        T867 t867 = new T867();
        Assert.assertArrayEquals(
                new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}},
                t867.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})
        );
    }
}