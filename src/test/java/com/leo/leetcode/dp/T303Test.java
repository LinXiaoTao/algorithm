package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T303Test {

    @Test
    public void sumRange() {
        T303 t303 = new T303(new int[]{-2, 0, 3, -5, 2, -1});
        Assert.assertEquals(
                1,
                t303.sumRange(0, 2)
        );
        Assert.assertEquals(
                -1,
                t303.sumRange(2, 5)
        );
        Assert.assertEquals(
                -3,
                t303.sumRange(0, 5)
        );
    }


}