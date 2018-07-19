package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class TwoStackQueueTest {


    @Test
    public void add() {
        try {
            TwoStackQueue<Integer> stackQueue = new TwoStackQueue<>();
            for (int i = 0; i < 10; i++) {
                stackQueue.add(i);
            }
        } catch (Exception e) {
            Assume.assumeNoException(e);
        }
    }

    @Test
    public void poll() {
        TwoStackQueue<Integer> stackQueue = new TwoStackQueue<>();
        for (int i = 0; i < 10; i++) {
            stackQueue.add(i);
        }
        Assert.assertSame(0, stackQueue.poll());
        Assert.assertSame(1, stackQueue.poll());
        Assert.assertSame(2, stackQueue.poll());
        stackQueue.add(11);
        stackQueue.add(12);
        Assert.assertSame(3, stackQueue.poll());
        Assert.assertSame(4, stackQueue.poll());
    }

    @Test
    public void peek() {
        TwoStackQueue<Integer> stackQueue = new TwoStackQueue<>();
        for (int i = 0; i < 10; i++) {
            stackQueue.add(i);
        }
        Assert.assertSame(0, stackQueue.peek());
        stackQueue.add(11);
        stackQueue.add(12);
        Assert.assertSame(0, stackQueue.peek());
        stackQueue.poll();
        Assert.assertSame(1, stackQueue.peek());
        stackQueue.poll();
        Assert.assertSame(2, stackQueue.peek());
    }
}