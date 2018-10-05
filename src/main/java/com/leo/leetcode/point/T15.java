package com.leo.leetcode.point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * https://leetcode-cn.com/problems/3sum/description/
 */
public class T15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            // 去重
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    // 大了
                    right--;
                } else if (sum < 0) {
                    // 小了
                    left++;
                } else {
                    // 合适
                    result.add(Arrays.asList(nums[left], nums[i], nums[right]));
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

}
