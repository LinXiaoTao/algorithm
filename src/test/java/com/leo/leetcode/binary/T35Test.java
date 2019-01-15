package com.leo.leetcode.binary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T35Test {

    @Test
    public void searchInsert() {
        T35 t35 = new T35();
        Assert.assertEquals(
                2,
                t35.searchInsert(new int[]{1, 3, 5, 6}, 5)
        );
        Assert.assertEquals(
                1,
                t35.searchInsert(new int[]{1, 3, 5, 6}, 2)
        );
        Assert.assertEquals(
                4,
                t35.searchInsert(new int[]{1, 3, 5, 6}, 7)
        );
        Assert.assertEquals(
                0,
                t35.searchInsert(new int[]{1, 3, 5, 6}, 0)
        );
    }
}