package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T380Test {

    @Test
    public void test(){
        T380 t380 = new T380();
        Assert.assertTrue(t380.insert(1));
        Assert.assertFalse(t380.remove(2));
        Assert.assertTrue(t380.insert(2));
        int random = t380.getRandom();
        Assert.assertTrue(random == 1 || random == 2);
        Assert.assertTrue(t380.remove(1));
        Assert.assertFalse(t380.insert(2));
        Assert.assertEquals(2,t380.getRandom());
    }

}