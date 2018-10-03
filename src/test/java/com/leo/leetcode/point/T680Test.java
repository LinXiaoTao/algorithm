package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T680Test {

    @Test
    public void validPalindrome() {

        T680 t680 = new T680();
        Assert.assertTrue(
                t680.validPalindrome("aba")
        );
        Assert.assertTrue(
                t680.validPalindrome("abca")
        );
        Assert.assertFalse(
                t680.validPalindrome("abeca")
        );
        Assert.assertTrue(
                t680.validPalindrome("abcbaa")
        );
        Assert.assertTrue(
                t680.validPalindrome("acbcba")
        );
        Assert.assertTrue(
                t680.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga")
        );
    }
}