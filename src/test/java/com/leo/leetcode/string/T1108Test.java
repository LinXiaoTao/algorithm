package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T1108Test {

    @Test
    public void defangIPaddr() {

        T1108 t1108 = new T1108();

        Assert.assertEquals(
                t1108.defangIPaddr("1.1.1.1"),
                "1[.]1[.]1[.]1"
        );


        Assert.assertEquals(
                t1108.defangIPaddr("255.100.50.0"),
                "255[.]100[.]50[.]0"
        );

    }
}