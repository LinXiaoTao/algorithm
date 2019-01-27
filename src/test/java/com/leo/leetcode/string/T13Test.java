package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T13Test {

    @Test
    public void romanToInt() {
        T13 t13 = new T13();
        Assert.assertEquals(
                3,
                t13.romanToInt("III")
        );
        Assert.assertEquals(
                4,
                t13.romanToInt("IV")
        );
        Assert.assertEquals(
                9,
                t13.romanToInt("IX")
        );
        Assert.assertEquals(
                58,
                t13.romanToInt("LVIII")
        );
        Assert.assertEquals(
                1994,
                t13.romanToInt("MCMXCIV")
        );
    }
}