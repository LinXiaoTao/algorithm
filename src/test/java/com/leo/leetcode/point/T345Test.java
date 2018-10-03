package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T345Test {

    @Test
    public void reverseVowels() {
        T345 t345 = new T345();
        Assert.assertEquals(
                "holle",
                t345.reverseVowels("hello")
        );
        Assert.assertEquals(
                "leotcede",
                t345.reverseVowels("leetcode")
        );

    }
}