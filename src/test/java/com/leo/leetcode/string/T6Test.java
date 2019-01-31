package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T6Test {

    @Test
    public void convert() {
        T6 t6 = new T6();
        Assert.assertEquals(
                "LCIRETOESIIGEDHN",
                t6.convert("LEETCODEISHIRING", 3)
        );
        Assert.assertEquals(
                "LDREOEIIECIHNTSG",
                t6.convert("LEETCODEISHIRING", 4)
        );
    }
}