package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T125Test {

    @Test
    public void isPalindrome() {
        T125 t125 = new T125();
        Assert.assertTrue(t125.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(t125.isPalindrome("race a car"));
        Assert.assertTrue(t125.isPalindrome(""));
        Assert.assertTrue(t125.isPalindrome(".,"));
        Assert.assertFalse(t125.isPalindrome("0P"));
    }
}