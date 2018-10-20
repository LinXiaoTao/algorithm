package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T343Test {

    @Test
    public void integerBreak() {
        T343 t343 = new T343();
        Assert.assertEquals(
                1,
                t343.integerBreak(2)
        );
        Assert.assertEquals(
                2,
                t343.integerBreak(3)
        );
        Assert.assertEquals(
                4,
                t343.integerBreak(4)
        );
        Assert.assertEquals(
                6,
                t343.integerBreak(5)
        );
        Assert.assertEquals(
                9,
                t343.integerBreak(6)
        );
        Assert.assertEquals(
                36,
                t343.integerBreak(10)
        );
    }
}