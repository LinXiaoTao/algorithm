package com.leo.leetcode.dp;

/**
 * 53. 最大子序和
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 */
public class T53 {

    public int maxSubArray(int[] nums) {
        // -2,1,-3,4,-1,2,1,-5,4
        // 4,-1,2,1
        if (nums.length == 0) {
            return 0;
        }
        int[] cache = new int[nums.length];
        int max = nums[0];
        cache[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cache[i] = Math.max(
                    nums[i],
                    cache[i - 1] + nums[i]
            );
            max = Math.max(
                    max,
                    cache[i]
            );
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {

        int sum = Integer.MIN_VALUE;
        int total_sum = 0;
        int i = 0;
        while (i < nums.length) {
            total_sum += nums[i];
            sum = Math.max(sum, total_sum);
            if (total_sum < 0) {
                total_sum = 0;
            }
            i++;
        }

        return sum;
    }

}
