package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T1025Test {

    @Test
    public void divisorGame() {

        T1025 t1025 = new T1025();
        Assert.assertTrue(
                t1025.divisorGame(2)
        );

        Assert.assertFalse(
                t1025.divisorGame(3)
        );


    }
}