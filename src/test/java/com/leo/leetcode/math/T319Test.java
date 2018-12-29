package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T319Test {

    @Test
    public void bulbSwitch() {
        T319 t319 = new T319();
        Assert.assertEquals(
                1,
                t319.bulbSwitch(3)
        );
    }
}