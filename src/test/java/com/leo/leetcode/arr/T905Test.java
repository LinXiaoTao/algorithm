package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T905Test {

    @Test
    public void sortArrayByParity() {
        T905 t905 = new T905();
        Assert.assertArrayEquals(
                new int[]{4, 2, 1, 3},
                t905.sortArrayByParity(new int[]{3, 1, 2, 4})
        );
    }
}