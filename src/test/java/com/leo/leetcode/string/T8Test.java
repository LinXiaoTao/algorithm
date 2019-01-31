package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T8Test {

    @Test
    public void myAtoi() {
        T8 t8 = new T8();

        Assert.assertEquals(
                42,
                t8.myAtoi("42")
        );

        Assert.assertEquals(
                -42,
                t8.myAtoi("   -42")
        );

        Assert.assertEquals(
                4193,
                t8.myAtoi("4193 with words")
        );

        Assert.assertEquals(
                0,
                t8.myAtoi("words and 987")
        );

        Assert.assertEquals(
                -2147483648,
                t8.myAtoi("-91283472332")
        );
        Assert.assertEquals(
                0,
                t8.myAtoi("+")
        );
        Assert.assertEquals(
                0,
                t8.myAtoi("-abc")
        );
        Assert.assertEquals(
                0,
                t8.myAtoi("+-2")
        );
        Assert.assertEquals(
                2147483647,
                t8.myAtoi("2147483648")
        );
    }


    @Test
    public void myAtoi1() {
        T8 t8 = new T8();

        Assert.assertEquals(
                42,
                t8.myAtoi1("42")
        );

        Assert.assertEquals(
                -42,
                t8.myAtoi1("   -42")
        );

        Assert.assertEquals(
                4193,
                t8.myAtoi1("4193 with words")
        );

        Assert.assertEquals(
                0,
                t8.myAtoi1("words and 987")
        );

        Assert.assertEquals(
                -2147483648,
                t8.myAtoi1("-91283472332")
        );
        Assert.assertEquals(
                0,
                t8.myAtoi1("+")
        );
        Assert.assertEquals(
                0,
                t8.myAtoi1("-abc")
        );
        Assert.assertEquals(
                0,
                t8.myAtoi1("+-2")
        );
        Assert.assertEquals(
                2147483647,
                t8.myAtoi1("2147483648")
        );
    }
}