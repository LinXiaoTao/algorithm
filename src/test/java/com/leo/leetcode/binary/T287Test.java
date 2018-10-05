package com.leo.leetcode.binary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T287Test {

    @Test
    public void findDuplicate() {
        T287 t287 = new T287();
        Assert.assertEquals(
                2,
                t287.findDuplicate(new int[]{1, 3, 4, 2, 2})
        );
        Assert.assertEquals(
                3,
                t287.findDuplicate(new int[]{3, 1, 3, 4, 2})
        );
    }

    @Test
    public void findDuplicate1() {
        T287 t287 = new T287();
        Assert.assertEquals(
                2,
                t287.findDuplicate1(new int[]{1, 3, 4, 2, 2})
        );
        Assert.assertEquals(
                3,
                t287.findDuplicate1(new int[]{3, 1, 3, 4, 2})
        );
    }
}