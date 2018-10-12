package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T64Test {

    @Test
    public void minPathSum() {
        T64 t64 = new T64();
        Assert.assertEquals(
                7,
                t64.minPathSum(new int[][]{
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}
                })
        );
    }
}