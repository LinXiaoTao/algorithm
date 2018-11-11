package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T322Test {

    @Test
    public void coinChange() {
        T322 t322 = new T322();
        Assert.assertEquals(
                3,
                t322.coinChange(new int[]{1, 2, 5}, 11)
        );
    }
}