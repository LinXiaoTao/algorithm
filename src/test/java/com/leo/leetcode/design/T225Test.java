package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T225Test {

    @Test
    public void testStack() {
        T225 t225 = new T225();
        t225.push(3);
        t225.push(2);
        t225.push(1);
        Assert.assertFalse(t225.empty());
        Assert.assertEquals(1,t225.top());
        Assert.assertEquals(1,t225.pop());
        Assert.assertEquals(2,t225.top());
    }

}