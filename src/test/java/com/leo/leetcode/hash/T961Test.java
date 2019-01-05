package com.leo.leetcode.hash;

import org.junit.Assert;
import org.junit.Test;

public class T961Test {

    @Test
    public void repeatedNTimes() {
        T961 t961 = new T961();
        Assert.assertEquals(
                3,
                t961.repeatedNTimes(new int[]{1, 2, 3, 3})
        );
        Assert.assertEquals(
                2,
                t961.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2})
        );
        Assert.assertEquals(
                5,
                t961.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4})
        );

    }
}