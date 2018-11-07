package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T561Test {

    @Test
    public void arrayPairSum() {

        T561 t561 = new T561();
        Assert.assertEquals(
                4,
                t561.arrayPairSum(new int[]{1, 4, 3, 2})
        );

    }
}