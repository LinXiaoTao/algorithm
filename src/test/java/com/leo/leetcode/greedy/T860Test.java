package com.leo.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T860Test {

    @Test
    public void lemonadeChange() {

        T860 t860 = new T860();

        Assert.assertTrue(
                t860.lemonadeChange(new int[]{5, 5, 5, 10, 20})
        );

        Assert.assertTrue(
                t860.lemonadeChange(new int[]{5, 5, 10})
        );

        Assert.assertFalse(
                t860.lemonadeChange(new int[]{10, 10})
        );

        Assert.assertFalse(
                t860.lemonadeChange(new int[]{5, 5, 10, 10, 20})
        );
    }
}