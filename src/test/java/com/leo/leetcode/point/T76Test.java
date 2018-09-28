package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T76Test {

    @Test
    public void minWindow() {

        T76 t76 = new T76();
        Assert.assertEquals("BANC", t76.minWindow("ADOBECODEBANC", "ABC"));
        Assert.assertEquals("", t76.minWindow("ADOBECODEBANC", "ADF"));
        Assert.assertEquals("aa", t76.minWindow("aa", "aa"));
        Assert.assertEquals("b", t76.minWindow("abc", "b"));
        Assert.assertEquals("aec",t76.minWindow("cabefgecdaecf","cae"));
    }
}