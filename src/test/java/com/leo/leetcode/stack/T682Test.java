package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T682Test {

    @Test
    public void calPoints() {
        T682 t682 = new T682();
        Assert.assertEquals(
                30,
                t682.calPoints1(new String[]{"5", "2", "C", "D", "+"})
        );
        Assert.assertEquals(
                27,
                t682.calPoints1(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"})
        );
    }
}