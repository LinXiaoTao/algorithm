package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T38Test {

    @Test
    public void countAndSay() {
        T38 t38 = new T38();

        Assert.assertEquals(
                "1",
                t38.countAndSay(1)
        );

        Assert.assertEquals(
                "1211",
                t38.countAndSay(4)
        );

        Assert.assertEquals(
                "312211",
                t38.countAndSay(6)
        );

    }
}