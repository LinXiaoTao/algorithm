package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T58Test {

    @Test
    public void lengthOfLastWord() {
        T58 t58 = new T58();
        Assert.assertEquals(
                5,
                t58.lengthOfLastWord("Hello World")
        );

        Assert.assertEquals(
                0,
                t58.lengthOfLastWord("")
        );

        Assert.assertEquals(
                0,
                t58.lengthOfLastWord(" ")
        );

    }
}