package com.leo.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T378Test {

    @Test
    public void kthSmallest() {
        T378 t378 = new T378();
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        Assert.assertEquals(13,t378.kthSmallest(matrix,8));
    }
}