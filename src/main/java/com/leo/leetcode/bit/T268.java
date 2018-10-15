package com.leo.leetcode.bit;

/**
 * 268. 缺失数字
 * https://leetcode-cn.com/problems/missing-number/description/
 */
public class T268 {

    public int missingNumber(int[] nums) {
        // [0,n]
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= (i + 1) ^ nums[i];
        }
        return sum;
    }


    public int missingNumber1(int[] nums) {
        // [0,n]
        int sum = (1 + nums.length) * nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

}
