package com.leo.leetcode.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 442. 数组中重复的数据
 * https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/description/
 */
public class T442 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        // 1,2,2,3,3,4,7,8
        while (left < nums.length) {
            int num = nums[left];
            while (right < nums.length && nums[right] == num) {
                right++;
            }
            if (right - left > 1) {
                result.add(num);
            }
            left = right;
        }
        return result;
    }

    public List<Integer> findDuplicates1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] temp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = temp[nums[i]] + 1;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 2){
                result.add(i);
            }
        }
        return result;
    }

}
