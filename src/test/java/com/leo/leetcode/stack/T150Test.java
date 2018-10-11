package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T150Test {

    @Test
    public void evalRPN() {
        T150 t150 = new T150();
        Assert.assertEquals(
                9,
                t150.evalRPN(new String[]{"2", "1", "+", "3", "*"})
        );
        Assert.assertEquals(
                6,
                t150.evalRPN(new String[]{"4", "13", "5", "/", "+"})
        );
        Assert.assertEquals(
                22,
                t150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"})
        );
        Assert.assertEquals(
                1,
                t150.evalRPN(new String[]{"4", "3", "-"})
        );
    }
}