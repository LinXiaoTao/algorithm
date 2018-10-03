package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T28Test {

    @Test
    public void strStr() {
        T28 t28 = new T28();
        Assert.assertEquals(
                2,
                t28.strStr("hello","ll")
        );
        Assert.assertEquals(
                -1,
                t28.strStr("aaaaa","bba")
        );
        Assert.assertEquals(
                -1,
                t28.strStr("mississippi","issipi")
        );
        Assert.assertEquals(
                4,
                t28.strStr("mississippi","issip")
        );
    }
}