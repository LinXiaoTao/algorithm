package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T80Test {

    @Test
    public void removeDuplicates() {

        T80 t80 = new T80();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int size = t80.removeDuplicates(nums);
        Assert.assertEquals(
                5,
                size
        );
        Assert.assertArrayEquals(
                new int[]{1, 1, 2, 2, 3},
                Arrays.copyOf(nums, size)
        );
    }

    @Test
    public void removeDuplicates1() {

        T80 t80 = new T80();
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int size = t80.removeDuplicates(nums);
        Assert.assertEquals(
                7,
                size
        );
        Assert.assertArrayEquals(
                new int[]{0, 0, 1, 1, 2, 3, 3},
                Arrays.copyOf(nums, size)
        );
    }
}