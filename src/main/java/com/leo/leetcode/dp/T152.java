package com.leo.leetcode.dp;

/**
 * 152. 乘积最大子序列
 * https://leetcode-cn.com/problems/maximum-product-subarray/
 */
public class T152 {

    public int maxProduct(int[] nums) {

        if (nums.length == 0) return 0;

        int max = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {

            int[] cache = new int[nums.length];

            cache[0] = nums[i];

            max = Math.max(max, cache[0]);

            for (int j = i + 1; j < nums.length; j++) {

                cache[j - i] = cache[j - i - 1] * nums[j];

                max = Math.max(max, cache[j - i]);

            }

        }

        return max;

    }

    public int maxProduct1(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int result = nums[0];
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {


            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], nums[i] * max);
            min = Math.min(nums[i], nums[i] * min);

            result = Math.max(result, max);
        }

        return result;
    }

}
