package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T14Test {

    @Test
    public void longestCommonPrefix() {
        T14 t14 = new T14();
        Assert.assertEquals(
                "fl",
                t14.longestCommonPrefix(new String[]{"flower", "flow", "flight"})
        );
        Assert.assertEquals(
                "",
                t14.longestCommonPrefix(new String[]{"dog", "racecar", "car"})
        );
    }
}