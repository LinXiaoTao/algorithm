package com.leo.leetcode.point;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * https://leetcode-cn.com/problems/3sum-closest/description/
 */
public class T16 {

    public int threeSumClosest(int[] nums, int target) {
        // Math.abs(target - sum) 最小
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 1; i < (nums.length - 1); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < nums.length) {
                if (Math.abs(nums[left] + nums[right] + nums[i] - target) < Math.abs(result - target)) {
                    result = nums[left] + nums[right] + nums[i];
                }
                int value = target - (nums[left] + nums[right]);
                if (nums[i] > value) {
                    // 过大
                    left--;
                } else if (nums[i] < value) {
                    // 过小
                    right++;
                } else {
                    // 最佳值
                    return target;
                }
            }
        }

        return result;
    }

}
