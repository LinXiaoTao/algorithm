package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T557Test {

    @Test
    public void reverseWords() {
        T557 t557 = new T557();
        Assert.assertEquals(
                "s'teL ekat edoCteeL tsetnoc",
                t557.reverseWords("Let's take LeetCode contest")
        );
    }
}