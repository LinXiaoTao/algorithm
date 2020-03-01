package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T91Test {

    @Test
    public void numDecodings() {

        T91 t91 = new T91();
        Assert.assertEquals(
                0,
                t91.numDecodings("0")
        );

        Assert.assertEquals(
                1,
                t91.numDecodings("1")
        );

        Assert.assertEquals(
                1,
                t91.numDecodings("10")
        );

        Assert.assertEquals(
                0,
                t91.numDecodings("100")
        );

        Assert.assertEquals(
                0,
                t91.numDecodings("01")
        );

    }
}