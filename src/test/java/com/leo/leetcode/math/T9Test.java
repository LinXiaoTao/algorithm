package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T9Test {

    @Test
    public void isPalindrome() {
        T9 t9 = new T9();
        Assert.assertTrue(
                t9.isPalindrome(121)
        );
        Assert.assertTrue(
                t9.isPalindrome(123321)
        );
        Assert.assertTrue(
                t9.isPalindrome(46764)
        );
        Assert.assertFalse(
                t9.isPalindrome(-121)
        );
        Assert.assertFalse(
                t9.isPalindrome(10)
        );
    }

    @Test
    public void isPalindrome1() {
        T9 t9 = new T9();
        Assert.assertTrue(
                t9.isPalindrome1(121)
        );
        Assert.assertTrue(
                t9.isPalindrome1(123321)
        );
        Assert.assertTrue(
                t9.isPalindrome1(46764)
        );
        Assert.assertFalse(
                t9.isPalindrome1(-121)
        );
        Assert.assertFalse(
                t9.isPalindrome1(10)
        );
    }
}