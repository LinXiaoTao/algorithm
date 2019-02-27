package com.leo.leetcode.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T784Test {

    @Test
    public void letterCasePermutation() {
        T784 t784 = new T784();
        Assert.assertEquals(
                Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2"),
                t784.letterCasePermutation("a1b2")
        );
        Assert.assertEquals(
                Arrays.asList("3z4", "3Z4"),
                t784.letterCasePermutation("3z4")
        );
        Assert.assertEquals(
                Arrays.asList("12345"),
                t784.letterCasePermutation("12345")
        );
    }
}