package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T622Test {

    @Test
    public void test() {

        T622 t622 = new T622(5);
        Assert.assertTrue(
                t622.isEmpty()
        );
        Assert.assertFalse(
                t622.isFull()
        );
        Assert.assertTrue(
                t622.enQueue(1)
        );
        Assert.assertTrue(
                t622.enQueue(2)
        );
        Assert.assertFalse(
                t622.isEmpty()
        );
        Assert.assertFalse(
                t622.isFull()
        );
        Assert.assertTrue(
                t622.enQueue(3)
        );
        Assert.assertEquals(
                1,
                t622.Front()
        );
        Assert.assertEquals(
                3,
                t622.Rear()
        );
        Assert.assertTrue(
                t622.enQueue(4)
        );
        Assert.assertTrue(
                t622.enQueue(5)
        );
        Assert.assertTrue(
                t622.isFull()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        // 2 3 4 5
        Assert.assertEquals(
                2,
                t622.Front()
        );
        Assert.assertEquals(
                5,
                t622.Rear()
        );
        Assert.assertTrue(
                t622.enQueue(6)
        );
        // 2 3 4 5 6
        Assert.assertTrue(
                t622.isFull()
        );
        Assert.assertFalse(
                t622.isEmpty()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        // 5,6
        Assert.assertEquals(
                5,
                t622.Front()
        );
        Assert.assertEquals(
                6,
                t622.Rear()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        //
        Assert.assertTrue(
                t622.isEmpty()
        );
        Assert.assertFalse(
                t622.isFull()
        );
    }

    @Test
    public void test1() {
        T622 t622 = new T622(2);
        Assert.assertTrue(t622.enQueue(4));
        Assert.assertEquals(
                4,
                t622.Rear()
        );
        Assert.assertTrue(t622.enQueue(9));
        Assert.assertTrue(t622.deQueue());
        Assert.assertEquals(
                9,
                t622.Front()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        Assert.assertFalse(
                t622.deQueue()
        );
        Assert.assertTrue(
                t622.isEmpty()
        );
        Assert.assertFalse(
                t622.deQueue()
        );
        Assert.assertTrue(
                t622.enQueue(6)
        );
        Assert.assertTrue(
                t622.enQueue(4)
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        Assert.assertTrue(
                t622.deQueue()
        );
        Assert.assertFalse(
                t622.deQueue()
        );
    }

}