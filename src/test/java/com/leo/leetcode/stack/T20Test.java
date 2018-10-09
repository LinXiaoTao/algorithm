package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T20Test {

    @Test
    public void isValid() {
        T20 t20 = new T20();
        Assert.assertTrue(
                t20.isValid("")
        );
        Assert.assertTrue(
                t20.isValid("()")
        );
        Assert.assertTrue(
                t20.isValid("()[]{}")
        );
        Assert.assertTrue(
                t20.isValid("{[]}")
        );
        Assert.assertFalse(
                t20.isValid("(]")
        );
        Assert.assertFalse(
                t20.isValid("([)]")
        );
    }
}