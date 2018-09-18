package com.leo.structure.heap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.function.ToIntFunction;

import static org.junit.Assert.*;

public class PriorityQueueTest {

    private PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    @Before
    public void setUp() throws Exception {
        priorityQueue.offer(3);
        priorityQueue.offer(25);
        priorityQueue.offer(2);
        priorityQueue.offer(100);
        priorityQueue.offer(36);
        priorityQueue.offer(1);
        priorityQueue.offer(19);
        priorityQueue.offer(7);
        priorityQueue.offer(17);
    }

    @Test
    public void testBuild() {
        int[] arr = priorityQueue.getData().stream().mapToInt(value -> value).toArray();
        Assert.assertArrayEquals(new int[]{100, 36, 19, 17, 25, 1, 2, 3, 7}, arr);
    }

    @Test
    public void testPoll() {
        int removeData = priorityQueue.poll();
        Assert.assertEquals(removeData, 100);
        int[] arr = priorityQueue.getData().stream().mapToInt(value -> value).toArray();
        Assert.assertArrayEquals(new int[]{36, 25, 19, 17, 7, 1, 2, 3}, arr);
    }

    @Test
    public void testRemove() {
        int removeData = priorityQueue.remove(1);
        Assert.assertEquals(removeData, 36);
        int[] arr = priorityQueue.getData().stream().mapToInt(value -> value).toArray();
        Assert.assertArrayEquals(new int[]{100, 25, 19, 17, 7, 1, 2, 3}, arr);
        removeData = priorityQueue.remove(arr.length - 1);
        Assert.assertEquals(removeData, 3);
        arr = priorityQueue.getData().stream().mapToInt(value -> value).toArray();
        Assert.assertArrayEquals(new int[]{100, 25, 19, 17, 7, 1, 2}, arr);
    }


}