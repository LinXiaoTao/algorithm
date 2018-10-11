package com.leo.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T371Test {

    @Test
    public void getSum() {
        T371 t371 = new T371();
        Assert.assertEquals(
                10,
                t371.getSum(2, 8)
        );
        Assert.assertEquals(
                400,
                t371.getSum(125, 275)
        );
        Assert.assertEquals(
                410,
                t371.getSum(125, 285)
        );
        Assert.assertEquals(
                1,
                t371.getSum(-2, 3)
        );
    }
}