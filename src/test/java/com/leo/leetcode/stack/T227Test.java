package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T227Test {

    @Test
    public void calculate() {

        T227 t227 = new T227();
        Assert.assertEquals(
                7,
                t227.calculate("3+2*2")
        );

        Assert.assertEquals(
                1,
                t227.calculate(" 3/2 ")
        );

        Assert.assertEquals(
                5,
                t227.calculate(" 3+5 / 2 ")
        );

        Assert.assertEquals(
                42,
                t227.calculate("42")
        );

        Assert.assertEquals(
                -2147483647,
                t227.calculate("0-2147483647")
        );

        Assert.assertEquals(
                8,
                t227.calculate("14/3*2")
        );

    }

    @Test
    public void calculate1() {

        T227 t227 = new T227();
        Assert.assertEquals(
                7,
                t227.calculate1("3+2*2")
        );

        Assert.assertEquals(
                1,
                t227.calculate1(" 3/2 ")
        );

        Assert.assertEquals(
                5,
                t227.calculate1(" 3+5 / 2 ")
        );

        Assert.assertEquals(
                42,
                t227.calculate1("42")
        );

        Assert.assertEquals(
                -2147483647,
                t227.calculate1("0-2147483647")
        );

        Assert.assertEquals(
                8,
                t227.calculate1("14/3*2")
        );

    }
}