package com.leo.leetcode.arr;

import com.leo.leetcode.arr.T922;
import org.junit.Assert;
import org.junit.Test;

public class T922Test {

    @Test
    public void sortArrayByParityII() {
        T922 t922 = new T922();
        Assert.assertArrayEquals(new int[]{4, 5, 2, 7},
                t922.sortArrayByParityII(new int[]{4, 2, 5, 7}));
    }
}