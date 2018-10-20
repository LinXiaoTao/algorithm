package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T740Test {

    @Test
    public void deleteAndEarn() {
        T740 t740 = new T740();
        Assert.assertEquals(
                6,
                t740.deleteAndEarn(new int[]{3, 4, 2})
        );
        Assert.assertEquals(
                9,
                t740.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4})
        );
        Assert.assertEquals(
                1,
                t740.deleteAndEarn(new int[]{1})
        );
        Assert.assertEquals(
                2,
                t740.deleteAndEarn(new int[]{1,1})
        );
    }
}