package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T503Test {

    @Test
    public void nextGreaterElements() {

        T503 t503 = new T503();
        Assert.assertArrayEquals(
                new int[]{2, -1, 2},
                t503.nextGreaterElements(new int[]{1, 2, 1})
        );
    }
}