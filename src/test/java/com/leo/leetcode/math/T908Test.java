package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T908Test {

    @Test
    public void smallestRangeI() {
        T908 t908 = new T908();
        Assert.assertEquals(
                0,
                t908.smallestRangeI(new int[]{}, 1)
        );
        Assert.assertEquals(
                0,
                t908.smallestRangeI(new int[]{1}, 1)
        );
        Assert.assertEquals(
                6,
                t908.smallestRangeI(new int[]{0, 10}, 2)
        );
        Assert.assertEquals(
                0,
                t908.smallestRangeI(new int[]{1, 3, 6}, 3)
        );
    }
}