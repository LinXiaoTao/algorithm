package com.leo.leetcode.point;

/**
 * https://leetcode-cn.com/problems/remove-element/description/
 */
public class T27 {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int left = -1;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                while (++left < right && nums[left] != val) {
                }
                nums[left] = nums[right];
                if (left != right) {
                    nums[right] = val;
                }
            }
            right++;
        }
        return left + 1;
    }
}
