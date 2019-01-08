package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

public class T7Test {

    @Test
    public void testReverse() {
        T7 t7 = new T7();
        Assert.assertEquals(
                321,
                t7.reverse(123)
        );
        Assert.assertEquals(
                -123,
                t7.reverse(-321)
        );
        Assert.assertEquals(
                21,
                t7.reverse(120)
        );
    }

}