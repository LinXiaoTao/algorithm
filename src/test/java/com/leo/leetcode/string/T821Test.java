package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T821Test {

    @Test
    public void shortestToChar() {
        T821 t821 = new T821();
        Assert.assertArrayEquals(
                new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
                t821.shortestToChar("loveleetcode", 'e')
        );
    }
}