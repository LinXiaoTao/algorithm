package com.leo.leetcode.ohter;

import com.leo.leetcode.other.T832;
import org.junit.Assert;
import org.junit.Test;

public class T832Test {

    @Test
    public void flipAndInvertImage() {
        T832 t832 = new T832();
        Assert.assertArrayEquals(
                new int[][]{
                        {1, 0, 0},
                        {0, 1, 0},
                        {1, 1, 1}
                },
                t832.flipAndInvertImage(new int[][]{
                        {1, 1, 0},
                        {1, 0, 1},
                        {0, 0, 0}
                })
        );
        Assert.assertArrayEquals(
                new int[][]{
                        {1, 1, 0, 0},
                        {0, 1, 1, 0},
                        {0, 0, 0, 1},
                        {1, 0, 1, 0}
                },
                t832.flipAndInvertImage(new int[][]{
                        {1, 1, 0, 0},
                        {1, 0, 0, 1},
                        {0, 1, 1, 1},
                        {1, 0, 1, 0}
                })
        );
    }
}