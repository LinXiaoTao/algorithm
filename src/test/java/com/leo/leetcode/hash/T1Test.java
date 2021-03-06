package com.leo.leetcode.hash;

import com.leo.leetcode.map.T1;
import org.junit.Assert;
import org.junit.Test;

public class T1Test {

    @Test
    public void twoSum() {

        T1 t1 = new T1();

        int[] nums = new int[]{-3, 4, 3, 90};
        int[] result = t1.twoSum(nums, 0);
        Assert.assertArrayEquals(result, new int[]{0, 2});

        nums = new int[]{3, 3};
        result = t1.twoSum(nums, 6);
        Assert.assertArrayEquals(result, new int[]{0, 1});

        nums = new int[]{3,2,4};
        result = t1.twoSum(nums, 6);
        Assert.assertArrayEquals(result, new int[]{1,2});
    }
}