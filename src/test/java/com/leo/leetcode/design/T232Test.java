package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T232Test {

    @Test
    public void testQueue(){
        T232 queue = new T232();
        queue.push(1);
        queue.push(2);
        Assert.assertEquals(1,queue.peek());
        Assert.assertEquals(1,queue.pop());
        Assert.assertFalse(queue.empty());
        queue.push(3);
        Assert.assertEquals(2,queue.pop());
        Assert.assertEquals(3,queue.pop());
    }

}