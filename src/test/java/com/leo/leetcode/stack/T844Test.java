package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T844Test {

    @Test
    public void backspaceCompare() {
        T844 t844 = new T844();
        Assert.assertTrue(
                t844.backspaceCompare("ab#c", "ad#c")
        );
        Assert.assertTrue(
                t844.backspaceCompare("ab##", "c#d#")
        );
        Assert.assertTrue(
                t844.backspaceCompare("a##c", "#a#c")
        );
        Assert.assertFalse(
                t844.backspaceCompare("a#c", "b")
        );
        Assert.assertTrue(
                t844.backspaceCompare("y#fo##f","y#f#o##f")
        );
    }
}