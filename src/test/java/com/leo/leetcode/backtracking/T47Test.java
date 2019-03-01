package com.leo.leetcode.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T47Test {

    @Test
    public void permuteUnique() {

        T47 t47 = new T47();
        Assert.assertEquals(
                Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), Arrays.asList(2, 1, 1)),
                t47.permuteUnique(new int[]{1, 1, 2})
        );

    }
}