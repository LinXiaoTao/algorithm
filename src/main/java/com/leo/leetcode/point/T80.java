package com.leo.leetcode.point;

/**
 * 80. 删除排序数组中的重复项 II
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/description/
 */
public class T80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int cur = 1;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            if (temp == nums[i - 1]) {
                count++;
                if (count < 2) {
                    nums[cur++] = temp;
                }
            }else {
                count = 0;
                nums[cur++] = temp;
            }
        }
        return cur;
    }

}
