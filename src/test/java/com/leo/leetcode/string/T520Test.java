package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T520Test {

    @Test
    public void detectCapitalUse() {
        T520 t520 = new T520();
        Assert.assertTrue(
                t520.detectCapitalUse("USA")
        );
        Assert.assertTrue(
                t520.detectCapitalUse("Usa")
        );
        Assert.assertTrue(
                t520.detectCapitalUse("usa")
        );
        Assert.assertFalse(
                t520.detectCapitalUse("FlaG")
        );
    }
}