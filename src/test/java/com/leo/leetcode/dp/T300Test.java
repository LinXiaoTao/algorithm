package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class T300Test {

    @Test
    public void lengthOfLIS() {
        T300 t300 = new T300();
        Assert.assertEquals(
                4,
                t300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})
        );
    }
}