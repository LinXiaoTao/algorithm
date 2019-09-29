package com.leo.leetcode.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class T448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }


        return result;

    }

}
