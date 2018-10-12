package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T53Test {

    @Test
    public void maxSubArray() {
        T53 t53 = new T53();
        Assert.assertEquals(
                6,
                t53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assert.assertEquals(
                1,
                t53.maxSubArray(new int[]{1}));
    }
}