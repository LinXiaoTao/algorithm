package com.leo.offer;

import org.junit.Assert;
import org.junit.Test;

public class T9Test {


    @Test
    public void test() {
        T9.CQueue cQueue = new T9.CQueue();
        cQueue.appendTail(3);
        Assert.assertEquals(
                3,
                cQueue.deleteHead()
        );
        Assert.assertEquals(
                -1,
                cQueue.deleteHead()
        );
    }
}