package com.leo.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class T373Test {

    @Test
    public void kSmallestPairs() {

        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};

        T373 t373 = new T373();
        List<int[]> result = t373.kSmallestPairs(nums1, nums2, 3);
        Assert.assertEquals(3, result.size());
        Assert.assertArrayEquals(new int[]{1, 2}, result.get(0));
        Assert.assertArrayEquals(new int[]{1, 4}, result.get(1));
        Assert.assertArrayEquals(new int[]{1, 6}, result.get(2));
    }

    @Test
    public void kSmallestPairs1() {

        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};

        T373 t373 = new T373();
        List<int[]> result = t373.kSmallestPairs(nums1, nums2, 2);
        Assert.assertEquals(2, result.size());
        Assert.assertArrayEquals(new int[]{1, 1}, result.get(0));
        Assert.assertArrayEquals(new int[]{1, 1}, result.get(1));
    }

    @Test
    public void kSmallestPairs2() {

        int[] nums1 = {1, 2};
        int[] nums2 = {3};

        T373 t373 = new T373();
        List<int[]> result = t373.kSmallestPairs(nums1, nums2, 3);
        Assert.assertEquals(2, result.size());
        Assert.assertArrayEquals(new int[]{1, 3}, result.get(0));
        Assert.assertArrayEquals(new int[]{2, 3}, result.get(1));
    }

    @Test
    public void kSmallestPairs3() {

        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};

        T373 t373 = new T373();
        List<int[]> result = t373.kSmallestPairs(nums1, nums2, 10);
        Assert.assertEquals(9, result.size());
        Assert.assertArrayEquals(new int[]{1, 1}, result.get(0));
        Assert.assertArrayEquals(new int[]{1, 1}, result.get(1));
        Assert.assertArrayEquals(new int[]{1, 2}, result.get(2));
        Assert.assertArrayEquals(new int[]{1, 2}, result.get(3));
        Assert.assertArrayEquals(new int[]{2, 1}, result.get(4));
        Assert.assertArrayEquals(new int[]{1, 3}, result.get(5));
        Assert.assertArrayEquals(new int[]{2, 2}, result.get(6));
        Assert.assertArrayEquals(new int[]{1, 3}, result.get(7));
        Assert.assertArrayEquals(new int[]{2, 3}, result.get(8));
    }
}