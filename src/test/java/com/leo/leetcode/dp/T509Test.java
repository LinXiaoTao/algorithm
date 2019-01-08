package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T509Test {

    @Test
    public void fib() {

        T509 t509 = new T509();
        Assert.assertEquals(
                1,
                t509.fib(2)
        );
        Assert.assertEquals(
                2,
                t509.fib(3)
        );
        Assert.assertEquals(
                3,
                t509.fib(4)
        );
    }
}