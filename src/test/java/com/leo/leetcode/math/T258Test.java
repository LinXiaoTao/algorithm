package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T258Test {

    @Test
    public void addDigits() {
        T258 t258 = new T258();
        Assert.assertEquals(
                1,
                t258.addDigits(37)
        );
        Assert.assertEquals(
                1,
                t258.addDigits(46)
        );
        Assert.assertEquals(
                0,
                t258.addDigits(0)
        );
        Assert.assertEquals(
                7,
                t258.addDigits(43)
        );
        Assert.assertEquals(
                9,
                t258.addDigits(9)
        );

    }
}