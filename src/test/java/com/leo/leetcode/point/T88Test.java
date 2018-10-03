package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T88Test {

    @Test
    public void merge() {
        T88 t88 = new T88();
        int[] num = new int[6];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        t88.merge(
                num,
                3,
                new int[]{2, 5, 6},
                3
        );
        Assert.assertArrayEquals(
                new int[]{1, 2, 2, 3, 5, 6},
                num
        );
    }
}