package com.leo.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T693Test {

    @Test
    public void hasAlternatingBits() {
        T693 t693 = new T693();
        Assert.assertTrue(
                t693.hasAlternatingBits(5)
        );
        Assert.assertFalse(
                t693.hasAlternatingBits(7)
        );
        Assert.assertFalse(
                t693.hasAlternatingBits(11)
        );
        Assert.assertTrue(
                t693.hasAlternatingBits(10)
        );
    }
}