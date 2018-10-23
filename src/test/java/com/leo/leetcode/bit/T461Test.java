package com.leo.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T461Test {

    @Test
    public void hammingDistance() {
        T461 t461 = new T461();
        Assert.assertEquals(
                2,
                t461.hammingDistance(1,4)
        );
    }
}