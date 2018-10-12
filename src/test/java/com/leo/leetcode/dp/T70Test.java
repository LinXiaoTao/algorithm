package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T70Test {

    @Test
    public void climbStairs() {
        T70 t70 = new T70();
        Assert.assertEquals(
                2,
                t70.climbStairs(2)
        );
        Assert.assertEquals(
                3,
                t70.climbStairs(3)
        );
    }
}