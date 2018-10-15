package com.leo.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T268Test {

    @Test
    public void missingNumber() {
        T268 t268 = new T268();
        Assert.assertEquals(
                2,
                t268.missingNumber(new int[]{3, 0, 1})
        );
        Assert.assertEquals(
                8,
                t268.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})
        );
    }
}