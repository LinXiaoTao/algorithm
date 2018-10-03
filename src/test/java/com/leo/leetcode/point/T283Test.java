package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T283Test {

    @Test
    public void moveZeroes() {
        T283 t283 = new T283();
        int[] num = {0, 1, 0, 3, 12};
        t283.moveZeroes(num);
        Assert.assertArrayEquals(
                new int[]{1, 3, 12, 0, 0},
                num
        );
    }

    @Test
    public void moveZeroes1() {
        T283 t283 = new T283();
        int[] num = {0, 0, 1};
        t283.moveZeroes(num);
        Assert.assertArrayEquals(
                new int[]{1, 0, 0},
                num
        );
    }
}