package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T131Test {

    @Test
    public void partition() {

        T131 t131 = new T131();
        Assert.assertEquals(
                Arrays.asList(
                        Arrays.asList("a", "a", "b"),
                        Arrays.asList("aa", "b")
                ),
                t131.partition("aab")

        );

    }

    @Test
    public void partition1() {

        T131 t131 = new T131();
        Assert.assertEquals(
                Arrays.asList(
                        Arrays.asList("a", "a", "b"),
                        Arrays.asList("aa", "b")
                ),
                t131.partition1("aab")

        );

    }

    @Test
    public void partition2() {

        T131 t131 = new T131();
        Assert.assertEquals(
                Arrays.asList(
                        Arrays.asList("a", "a", "b"),
                        Arrays.asList("aa", "b")
                ),
                t131.partition2("aab")

        );

    }
}