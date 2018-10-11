package com.leo.leetcode.hash;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T771Test {

    @Test
    public void numJewelsInStones() {

        T771 t771 = new T771();
        Assert.assertEquals(
                3,
                t771.numJewelsInStones("aA", "aAAbbbb")
        );
        Assert.assertEquals(
                0,
                t771.numJewelsInStones("z", "ZZ")
        );
        Assert.assertEquals(
                3,
                t771.numJewelsInStones1("aA", "aAAbbbb")
        );
        Assert.assertEquals(
                0,
                t771.numJewelsInStones1("z", "ZZ")
        );
    }
}