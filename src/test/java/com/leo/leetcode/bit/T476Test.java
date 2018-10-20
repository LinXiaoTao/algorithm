package com.leo.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T476Test {

    @Test
    public void findComplement() {
        T476 t476 = new T476();
        Assert.assertEquals(
                2,
                t476.findComplement(5)
        );
        Assert.assertEquals(
                0,
                t476.findComplement(1)
        );
    }
}