package com.leo.leetcode.point;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class T26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        while (++right < nums.length) {
            if (nums[right] > nums[left] && ++left < right) {
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}
