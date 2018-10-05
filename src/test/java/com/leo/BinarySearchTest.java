package com.leo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search() {

        int[] nums = new int[]{0, 1, 2, 3, 4, 5};
        Assert.assertEquals(
                5,
                BinarySearch.search(nums, 0, nums.length - 1, 5)
        );
        Assert.assertEquals(
                -1,
                BinarySearch.search(nums, 0, nums.length - 1, 7)
        );
    }
}