package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T877Test {

    @Test
    public void stoneGame() {
        T877 t877 = new T877();
        Assert.assertTrue(
                t877.stoneGame(new int[]{5, 3, 4, 5})
        );
    }
}