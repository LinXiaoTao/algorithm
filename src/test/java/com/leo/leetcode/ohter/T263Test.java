package com.leo.leetcode.ohter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T263Test {

    @Test
    public void isUgly() {

        T263 t263 = new T263();
        Assert.assertTrue(t263.isUgly(6));
        Assert.assertTrue(t263.isUgly(8));
        Assert.assertFalse(t263.isUgly(14));
    }
}