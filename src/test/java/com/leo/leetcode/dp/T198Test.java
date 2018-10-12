package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T198Test {

    @Test
    public void rob() {
        T198 t198 = new T198();
        Assert.assertEquals(
                4,
                t198.rob(new int[]{1, 2, 3, 1})
        );
        Assert.assertEquals(
                12,
                t198.rob(new int[]{2, 7, 9, 3, 1})
        );
    }

    @Test
    public void rob1() {
        T198 t198 = new T198();
        Assert.assertEquals(
                12,
                t198.rob1(new int[]{2, 7, 9, 3, 1})
        );
    }
}