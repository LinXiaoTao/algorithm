package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class T448Test {

    @Test
    public void findDisappearedNumbers() {

        T448 t448 = new T448();
        Assert.assertEquals(
                Arrays.asList(5, 6),
                t448.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})
        );

    }
}