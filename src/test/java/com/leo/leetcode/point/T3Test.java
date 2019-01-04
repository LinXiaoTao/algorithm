package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T3Test {

    @Test
    public void lengthOfLongestSubstring() {
        T3 t3 = new T3();
        Assert.assertEquals(
                3,
                t3.lengthOfLongestSubstring("abcabcbb")
        );
        Assert.assertEquals(
                1,
                t3.lengthOfLongestSubstring("bbbbb")
        );
        Assert.assertEquals(
                3,
                t3.lengthOfLongestSubstring("pwwkew")
        );
    }
}