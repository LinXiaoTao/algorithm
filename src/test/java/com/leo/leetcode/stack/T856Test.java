package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T856Test {

    @Test
    public void scoreOfParentheses() {
        T856 t856 = new T856();
        Assert.assertEquals(
                6,
                t856.scoreOfParentheses("(()(()))")
        );
        Assert.assertEquals(
                6,
                t856.scoreOfParentheses1("(()(()))")
        );
        Assert.assertEquals(
                2,
                t856.scoreOfParentheses("(())")
        );
        Assert.assertEquals(
                1,
                t856.scoreOfParentheses("()")
        );
        Assert.assertEquals(
                2,
                t856.scoreOfParentheses("()()")
        );
    }
}