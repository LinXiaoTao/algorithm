package com.leo.guide.part4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fun1() {
        Assert.assertEquals(
                8,
                Fibonacci.fun1(6)
        );
        Assert.assertEquals(
                13,
                Fibonacci.fun1(7)
        );
    }

    @Test
    public void fun2() {
        Assert.assertEquals(
                8,
                Fibonacci.fun2(6)
        );
        Assert.assertEquals(
                13,
                Fibonacci.fun2(7)
        );
    }

    @Test
    public void fun3() {
        Assert.assertEquals(
                8,
                Fibonacci.fun3(6)
        );
        Assert.assertEquals(
                13,
                Fibonacci.fun3(7)
        );
    }
}