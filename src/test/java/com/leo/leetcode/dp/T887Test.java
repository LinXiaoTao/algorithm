package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T887Test {

    @Test
    public void superEggDrop() {

        T887 t887 = new T887();
        Assert.assertEquals(
                2,
                t887.superEggDrop(1, 2)
        );

        Assert.assertEquals(
                3,
                t887.superEggDrop(2, 6)
        );

        Assert.assertEquals(
                4,
                t887.superEggDrop(3, 14)
        );


    }

    @Test
    public void superEggDrop1() {

        T887 t887 = new T887();
        Assert.assertEquals(
                2,
                t887.superEggDrop1(1, 2)
        );

        Assert.assertEquals(
                3,
                t887.superEggDrop1(2, 6)
        );

        Assert.assertEquals(
                4,
                t887.superEggDrop1(3, 14)
        );


    }



}