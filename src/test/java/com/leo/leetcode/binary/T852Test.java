package com.leo.leetcode.binary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T852Test {

    @Test
    public void peakIndexInMountainArray() {
        T852 t852 = new T852();
        Assert.assertEquals(
                1,
                t852.peakIndexInMountainArray(new int[]{0, 2, 1, 0})
        );
        Assert.assertEquals(
                1,
                t852.peakIndexInMountainArray(new int[]{0, 1, 0})
        );
    }
}