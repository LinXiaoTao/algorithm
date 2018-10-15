package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T96Test {

    @Test
    public void numTrees() {
        T96 t96 = new T96();
        Assert.assertEquals(
                5,
                t96.numTrees(3)
        );
    }
}