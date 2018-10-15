package com.leo.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

public class T136Test {

    @Test
    public void singleNumber() {
        T136 t136 = new T136();
        Assert.assertEquals(
                1,
                t136.singleNumber(new int[]{2, 2, 1})
        );
        Assert.assertEquals(
                4,
                t136.singleNumber(new int[]{4, 1, 2, 1, 2})
        );
    }
}