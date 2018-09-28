package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class T438Test {

    @Test
    public void findAnagrams() {
        T438 t438 = new T438();
        Assert.assertEquals(Arrays.asList(0, 6), t438.findAnagrams("cbaebabacd", "abc"));
        Assert.assertEquals(Arrays.asList(0, 1, 2), t438.findAnagrams("abab", "ab"));
    }
}