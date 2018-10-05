package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T16Test {

    @Test
    public void threeSumClosest() {
        T16 t16 = new T16();
        Assert.assertEquals(
                2,
                t16.threeSumClosest(new int[]{-1, 2, 1, -4}, 1)
        );
        Assert.assertEquals(
                1,
                t16.threeSumClosest(new int[]{1, 1, -1}, 0)
        );
        Assert.assertEquals(
                -2,
                t16.threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1)
        );
    }
}