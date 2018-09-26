package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T381Test {

    @Test
    public void test() {
        T381 t381 = new T381();
        Assert.assertTrue(t381.insert(1));
        Assert.assertFalse(t381.insert(1));
        Assert.assertTrue(t381.insert(2));
        Assert.assertTrue(t381.remove(1));
    }

}