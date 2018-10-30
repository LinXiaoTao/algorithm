package com.leo.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T500Test {

    @Test
    public void findWords() {
        T500 t500 = new T500();
        Assert.assertArrayEquals(
                new String[]{"Alaska", "Dad"},
                t500.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})
        );
        Assert.assertArrayEquals(
                new String[]{"asdfghjkl", "qwertyuiop", "zxcvbnm"},
                t500.findWords(new String[]{"asdfghjkl", "qwertyuiop", "zxcvbnm"})
        );
    }
}