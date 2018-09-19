package com.leo.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T347Test {

    @Test
    public void topKFrequent() {
        T347 t347 = new T347();
        int[] arr1 = {1, 1, 1, 2, 2, 3};
        Assert.assertArrayEquals(
                new int[]{1, 2},
                t347.topKFrequent(arr1, 2).stream().mapToInt(Integer::intValue).toArray()
        );

        int[] arr2 = {1};
        Assert.assertArrayEquals(
                new int[]{1},
                t347.topKFrequent(arr1, 1).stream().mapToInt(Integer::intValue).toArray()
        );
    }
}