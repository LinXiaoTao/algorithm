package com.leo.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

public class T973Test {

    @Test
    public void kClosest() {
        T973 t973 = new T973();
        Assert.assertArrayEquals(
                new int[]{-2, 2},
                t973.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1)[0]
        );
        Assert.assertArrayEquals(
                new int[][]{{3, 3}, {-2, 4}},
                t973.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2)
        );
    }
}