package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T521Test {

    @Test
    public void findLUSlength() {

        T521 t521 = new T521();
        Assert.assertEquals(
                3,
                t521.findLUSlength("aba", "cdc")
        );

    }
}