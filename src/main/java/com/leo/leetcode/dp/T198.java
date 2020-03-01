package com.leo.leetcode.dp;

/**
 * 198. 打家劫舍
 * https://leetcode-cn.com/problems/house-robber/description/
 */
public class T198 {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] cache = new int[nums.length];
        cache[0] = nums[0];
        cache[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                cache[i] = Math.max(cache[i], cache[j] + nums[i]);
            }
        }

        return Math.max(cache[nums.length - 1], cache[nums.length - 2]);
    }

    public int rob1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);
        int max = 0;
        for (int i = 2; i < nums.length; i++) {
            max = Math.max(a + nums[i], b);
            a = b;
            b = max;
        }

        return max;
    }


}
