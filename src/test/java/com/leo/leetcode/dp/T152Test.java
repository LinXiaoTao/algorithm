package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T152Test {

    @Test
    public void maxProduct() {

        T152 t152 = new T152();

        Assert.assertEquals(
                6,
                t152.maxProduct(new int[]{2, 3, -2, 4})
        );

        Assert.assertEquals(
                0,
                t152.maxProduct(new int[]{-2, 0, -1})
        );

    }

    @Test
    public void maxProduct1() {

        T152 t152 = new T152();

        Assert.assertEquals(
                6,
                t152.maxProduct1(new int[]{2, 3, -2, 4})
        );

        Assert.assertEquals(
                0,
                t152.maxProduct1(new int[]{-2, 0, -1})
        );

    }
}