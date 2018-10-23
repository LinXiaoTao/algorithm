package com.leo.leetcode.weekly;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T925Test {

    @Test
    public void isLongPressedName() {
        T925 t925 = new T925();
        Assert.assertTrue(
                t925.isLongPressedName("alex", "aaleex")
        );
        Assert.assertFalse(
                t925.isLongPressedName("saeed", "ssaaedd")
        );

        Assert.assertTrue(
                t925.isLongPressedName("leelee", "lleeelee")
        );

        Assert.assertTrue(
                t925.isLongPressedName("laiden", "laiden")
        );

        Assert.assertFalse(
                t925.isLongPressedName("pyplrz","ppyypllr")
        );

    }
}