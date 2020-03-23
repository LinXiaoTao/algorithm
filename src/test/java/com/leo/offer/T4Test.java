package com.leo.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T4Test {

    @Test
    public void findNumberIn2DArray() {
        T4 t4 = new T4();
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        Assert.assertTrue(
                t4.findNumberIn2DArray(matrix, 5)
        );
        Assert.assertFalse(
                t4.findNumberIn2DArray(matrix, 20)
        );
    }
}