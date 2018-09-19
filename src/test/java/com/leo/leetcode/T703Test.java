package com.leo.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class T703Test {

    @Test
    public void testAdd() {
        int[] arr = new int[]{4, 5, 8, 2};
        T703 kthLargest = new T703(3, arr);
        Assert.assertEquals(4, kthLargest.add(3));
        Assert.assertEquals(5, kthLargest.add(5));
        Assert.assertEquals(5, kthLargest.add(10));
        Assert.assertEquals(8, kthLargest.add(9));
        Assert.assertEquals(8, kthLargest.add(4));
    }

    @Test
    public void test2() {
        int[] arr = new int[]{5, -1};
        T703 kthLargest = new T703(3, arr);
        Assert.assertEquals(-1, kthLargest.add(2));
        Assert.assertEquals(1, kthLargest.add(1));
        Assert.assertEquals(1, kthLargest.add(-1));
        Assert.assertEquals(2, kthLargest.add(3));
        Assert.assertEquals(3, kthLargest.add(4));
    }

    @Test
    public void test3() {
        int[] arr = new int[]{-10,1,3,1,4,10,3,9,4,5,1};
        T703 kthLargest = new T703(7, arr);
        Assert.assertEquals(3, kthLargest.add(3));
        Assert.assertEquals(3, kthLargest.add(2));
        Assert.assertEquals(3, kthLargest.add(3));
        Assert.assertEquals(3, kthLargest.add(1));
        Assert.assertEquals(3, kthLargest.add(2));
        Assert.assertEquals(3, kthLargest.add(4));
        Assert.assertEquals(4, kthLargest.add(5));
        Assert.assertEquals(4, kthLargest.add(5));
        Assert.assertEquals(4, kthLargest.add(6));
        Assert.assertEquals(5, kthLargest.add(7));
        Assert.assertEquals(5, kthLargest.add(7));
        Assert.assertEquals(5, kthLargest.add(8));
        Assert.assertEquals(5, kthLargest.add(2));
        Assert.assertEquals(5, kthLargest.add(3));
        Assert.assertEquals(5, kthLargest.add(1));
        Assert.assertEquals(5, kthLargest.add(1));
        Assert.assertEquals(5, kthLargest.add(1));
        Assert.assertEquals(6, kthLargest.add(10));
        Assert.assertEquals(7, kthLargest.add(11));
        Assert.assertEquals(7, kthLargest.add(5));
        Assert.assertEquals(7, kthLargest.add(6));
        Assert.assertEquals(7, kthLargest.add(2));
        Assert.assertEquals(7, kthLargest.add(4));
        Assert.assertEquals(7, kthLargest.add(7));
        Assert.assertEquals(7, kthLargest.add(8));
        Assert.assertEquals(7, kthLargest.add(5));
        Assert.assertEquals(7, kthLargest.add(6));

    }

}