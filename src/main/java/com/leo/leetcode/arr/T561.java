package com.leo.leetcode.arr;

import java.util.Arrays;

/**
 * 561. 数组拆分 I
 * https://leetcode-cn.com/problems/array-partition-i/description/
 */
public class T561 {

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

}
