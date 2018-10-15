package com.leo.leetcode.bit;

import java.util.Arrays;

/**
 * 136. 只出现一次的数字
 * https://leetcode-cn.com/problems/single-number/description/
 */
public class T136 {

    public int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
        }
        return temp;
    }

    public int singleNumber1(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                // 两天相同元素
                i += 2;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

}
