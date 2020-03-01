package com.leo.leetcode.binary;

import java.util.Arrays;

/**
 * 287. 寻找重复数
 * https://leetcode-cn.com/problems/find-the-duplicate-number/description/
 */
public class T287 {


    public int findDuplicate(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    // 使用二分法
    // 条件：1.数组在 [1,n]；2.下标在 [0,n]
    // 可知至少有一个元素重复
    // 假设数组在 [1,n]，下标在 [0,n-1] 并且没有重复数据，则 值 <= 下标 的个数刚好为 下标数
    // 如果存在重复元素，则 值 <= 下标的个数大于 下标数
    public int findDuplicate1(int[] nums) {
        // 对值做二分法，而不是下标
        int left = 1;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                // 重复元素的值 [left,mid]
                right = mid;
            } else {
                // count <= mid
                // 重复元素的值 [mid + 1,right]
                left = mid + 1;
            }
        }
        return left;
    }

    public int findDuplicate2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int target = Math.abs(nums[i]) - 1;
            if (nums[target] < 0) {
                return Math.abs(nums[i]);
            }
            nums[target] = nums[target] * -1;
        }


        return -1;
    }

}
