package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T942Test {

    @Test
    public void diStringMatch() {
        T942 t942 = new T942();
        Assert.assertArrayEquals(
                new int[]{0, 4, 1, 3, 2},
                t942.diStringMatch("IDID")
        );
        Assert.assertArrayEquals(
                new int[]{0, 1, 2, 3},
                t942.diStringMatch("III")
        );
        Assert.assertArrayEquals(
                new int[]{3, 2, 0, 1},
                t942.diStringMatch("DDI")
        );
    }
}