package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T171Test {

    @Test
    public void titleToNumber() {
        T171 t171 = new T171();
        Assert.assertEquals(
                703,
                t171.titleToNumber("AAA")
        );
        Assert.assertEquals(
                27,
                t171.titleToNumber("AA")
        );
        Assert.assertEquals(
                28,
                t171.titleToNumber("AB")
        );
        Assert.assertEquals(
                1,
                t171.titleToNumber("A")
        );
        Assert.assertEquals(
                701,
                t171.titleToNumber("ZY")
        );
    }
}