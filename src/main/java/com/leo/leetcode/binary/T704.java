package com.leo.leetcode.binary;

/**
 * 704. 二分查找
 * https://leetcode-cn.com/problems/binary-search/description/
 */
public class T704 {

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

}
