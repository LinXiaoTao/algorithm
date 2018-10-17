package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T62Test {

    @Test
    public void uniquePaths() {
        T62 t62 = new T62();
        Assert.assertEquals(
                3,
                t62.uniquePaths(3, 2)
        );
        Assert.assertEquals(
                28,
                t62.uniquePaths(7, 3)
        );
    }
}