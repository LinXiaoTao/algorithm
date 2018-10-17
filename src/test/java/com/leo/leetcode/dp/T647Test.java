package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T647Test {

    @Test
    public void countSubstrings() {
        T647 t647 = new T647();
        Assert.assertEquals(
                6,
                t647.countSubstrings("aaa"));
        Assert.assertEquals(
                3,
                t647.countSubstrings("abc")
        );
    }

    @Test
    public void countSubstrings1() {
        T647 t647 = new T647();
        Assert.assertEquals(
                6,
                t647.countSubstrings1("aaa"));
        Assert.assertEquals(
                3,
                t647.countSubstrings1("abc")
        );
    }
}