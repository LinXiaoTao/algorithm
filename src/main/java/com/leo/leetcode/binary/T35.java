package com.leo.leetcode.binary;

/**
 * 35. 搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/description/
 */
public class T35 {


    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
