package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T672Test {

    @Test
    public void flipLights() {
        T672 t672 = new T672();
        Assert.assertEquals(
                2,
                t672.flipLights(1, 1)
        );
        Assert.assertEquals(
                3,
                t672.flipLights(2, 1)
        );
        Assert.assertEquals(
                4,
                t672.flipLights(3, 1)
        );
        Assert.assertEquals(
                7,
                t672.flipLights(3, 2)
        );
        Assert.assertEquals(
                8,
                t672.flipLights(3, 3)
        );
    }
}