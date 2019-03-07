package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T87Test {

    @Test
    public void addBinary() {

        T87 t87 = new T87();

        Assert.assertEquals(
                "100",
                t87.addBinary("11", "1")
        );

        Assert.assertEquals(
                "10101",
                t87.addBinary("1010", "1011")
        );

        Assert.assertEquals(
                "",
                t87.addBinary("", "")
        );

        Assert.assertEquals(
                "1010",
                t87.addBinary("1010", "")
        );


    }
}