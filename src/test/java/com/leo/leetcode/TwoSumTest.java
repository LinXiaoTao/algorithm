package com.leo.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {

        int[] nums = new int[]{-3, 4, 3, 90};
        int[] result = TwoSum.twoSum(nums, 0);
        System.out.println("result: " + Arrays.toString(result));
        Assert.assertArrayEquals(result, new int[]{0, 2});

        nums = new int[]{3, 3};
        result = TwoSum.twoSum(nums, 6);
        System.out.println("result: " + Arrays.toString(result));
        Assert.assertArrayEquals(result, new int[]{0, 1});

        nums = new int[]{3,2,4};
        result = TwoSum.twoSum(nums, 6);
        System.out.println("result: " + Arrays.toString(result));
        Assert.assertArrayEquals(result, new int[]{1,2});
    }
}