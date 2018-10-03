package com.leo.leetcode.point;

/**
 * https://leetcode-cn.com/problems/move-zeroes/description/
 */
public class T283 {

    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
