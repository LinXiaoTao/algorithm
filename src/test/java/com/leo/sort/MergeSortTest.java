package com.leo.sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        MergeSort.sort(arr);
        Assert.assertArrayEquals(arr,new int[]{1,2,3,4,5,6,7,8,9});
    }
}