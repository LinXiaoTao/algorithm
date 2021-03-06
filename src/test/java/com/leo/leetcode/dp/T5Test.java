package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class T5Test {

    @Test
    public void longestPalindrome() {
        T5 t5 = new T5();
        Assert.assertEquals(
                "aba",
                t5.longestPalindrome("babad")
        );
        Assert.assertEquals(
                "bb",
                t5.longestPalindrome("cbbd")
        );
        Assert.assertEquals(
                "a",
                t5.longestPalindrome("abcda")
        );
    }

    @Test
    public void longestPalindrome2() {
        T5 t5 = new T5();
        Assert.assertEquals(
                "bab",
                t5.longestPalindrome2("babad")
        );
        Assert.assertEquals(
                "bb",
                t5.longestPalindrome2("cbbd")
        );
        Assert.assertEquals(
                "a",
                t5.longestPalindrome2("abcda")
        );
    }

    @Test
    public void longestPalindrome3() {
        T5 t5 = new T5();

        Assert.assertTrue(
                t5.longestPalindrome3("babad").equals("bab") || t5.longestPalindrome3("babad").equals("aba")
        );

        Assert.assertEquals(
                "bb",
                t5.longestPalindrome3("cbbd")
        );
        Assert.assertEquals(
                "a",
                t5.longestPalindrome3("abcda")
        );
        Assert.assertEquals(
                "aaaa",
                t5.longestPalindrome3("aaaa")
        );
    }
}