package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T718Test {

    @Test
    public void findLength() {
        T718 t718 = new T718();
        Assert.assertEquals(
                3,
                t718.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7})
        );
    }
}