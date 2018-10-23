package com.leo.leetcode.math;

import com.leo.leetcode.math.T263;
import org.junit.Assert;
import org.junit.Test;

public class T263Test {

    @Test
    public void isUgly() {

        T263 t263 = new T263();
        Assert.assertTrue(t263.isUgly(6));
        Assert.assertTrue(t263.isUgly(8));
        Assert.assertFalse(t263.isUgly(14));
    }
}