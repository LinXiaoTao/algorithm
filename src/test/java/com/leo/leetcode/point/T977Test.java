package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T977Test {

    @Test
    public void sortedSquares() {
        T977 t977 = new T977();
        Assert.assertArrayEquals(
                new int[]{0, 1, 9, 16, 100},
                t977.sortedSquares(new int[]{-4, -1, 0, 3, 10})
        );
        Assert.assertArrayEquals(
                new int[]{4, 9, 9, 49, 121},
                t977.sortedSquares(new int[]{-7, -3, 2, 3, 11})
        );
    }
}