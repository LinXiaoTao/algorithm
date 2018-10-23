package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T728Test {

    @Test
    public void selfDividingNumbers() {
        T728 t728 = new T728();
        Assert.assertEquals(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22),
                t728.selfDividingNumbers(1, 22)
        );
    }
}