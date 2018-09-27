package com.leo.leetcode.ohter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T242Test {

    @Test
    public void isAnagram() {
        T242 t242 = new T242();
        Assert.assertTrue(t242.isAnagram("anagram", "nagaram"));
        Assert.assertFalse(t242.isAnagram("rat", "car"));
        Assert.assertFalse(t242.isAnagram("a", "ab"));
    }
}