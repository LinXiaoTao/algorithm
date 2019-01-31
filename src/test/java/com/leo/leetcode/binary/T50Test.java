package com.leo.leetcode.binary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T50Test {

    @Test
    public void myPow() {

        T50 t50 = new T50();

        Assert.assertEquals(
                1024.00000,
                t50.myPow(2.00000, 10),
                0
        );

        Assert.assertEquals(
                9.26100,
                t50.myPow(2.10000, 3),
                0.001
        );

        Assert.assertEquals(
                0.25000,
                t50.myPow(2.00000, -2),
                0
        );

    }
}