package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T717Test {

    @Test
    public void isOneBitCharacter() {
        T717 t717 = new T717();
        Assert.assertTrue(
                t717.isOneBitCharacter(new int[]{1, 0, 0})
        );
        Assert.assertFalse(
                t717.isOneBitCharacter(new int[]{1, 1, 1, 0})
        );
        Assert.assertFalse(
                t717.isOneBitCharacter(new int[]{1, 1, 0, 1, 0})
        );

        Assert.assertTrue(
                t717.isOneBitCharacter1(new int[]{1, 0, 0})
        );
        Assert.assertFalse(
                t717.isOneBitCharacter1(new int[]{1, 1, 1, 0})
        );
        Assert.assertFalse(
                t717.isOneBitCharacter1(new int[]{1, 1, 0, 1, 0})
        );
    }
}