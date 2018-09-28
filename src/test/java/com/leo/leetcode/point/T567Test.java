package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

public class T567Test {

    @Test
    public void checkInclusion() {
        T567 t567 = new T567();
        Assert.assertTrue(t567.checkInclusion("ab","eidbaooo"));
        Assert.assertFalse(t567.checkInclusion("ab","eidboaoo"));
    }
}