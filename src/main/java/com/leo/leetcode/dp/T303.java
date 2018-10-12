package com.leo.leetcode.dp;

/**
 * 303. 区域和检索 - 数组不可变
 * https://leetcode-cn.com/problems/range-sum-query-immutable/description/
 */
public class T303 {

    private final int[] result;

    public T303(int[] nums) {
        result = new int[nums.length];
        if (nums.length > 0){
            result[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result[i] = result[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0){
            return result[j];
        }
        return result[j] - result[i - 1];
    }

}
