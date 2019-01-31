package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T69Test {

    @Test
    public void mySqrt() {
        T69 t69 = new T69();

        Assert.assertEquals(
                2,
                t69.mySqrt(4)
        );

        Assert.assertEquals(
                2,
                t69.mySqrt(8)
        );

    }
}