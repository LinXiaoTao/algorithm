package com.leo.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T1051Test {

    @Test
    public void heightChecker() {

        T1051 t1051 = new T1051();

        Assert.assertEquals(
                3,
                t1051.heightChecker(new int[]{1, 1, 4, 2, 1, 3})
        );

    }
}