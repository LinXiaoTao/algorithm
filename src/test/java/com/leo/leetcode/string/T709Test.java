package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T709Test {

    @Test
    public void toLowerCase() {
        T709 t709 = new T709();
        Assert.assertEquals(
                "hello",
                t709.toLowerCase("Hello")
        );
        Assert.assertEquals(
                "hello",
                t709.toLowerCase("Hello")
        );
        Assert.assertEquals(
                "here",
                t709.toLowerCase("here")
        );
        Assert.assertEquals(
                "lovely",
                t709.toLowerCase("LOVELY")
        );
    }
}