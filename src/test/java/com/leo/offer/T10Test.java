package com.leo.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T10Test {

    @Test
    public void fib() {
        T10 t10 = new T10();
        Assert.assertEquals(
                1,
                t10.fib(2)
        );
        Assert.assertEquals(
                5,
                t10.fib(5)
        );
    }
}