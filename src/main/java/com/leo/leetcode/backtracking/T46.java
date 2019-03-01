package com.leo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 46. 全排列
 * https://leetcode-cn.com/problems/permutations/
 */
public class T46 {

    public List<List<Integer>> permute(int[] nums) {

        if (nums.length == 0) {
            return Arrays.asList(Arrays.asList());
        }

        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, 0, new ArrayList<>(), nums);
        return result;
    }

    private void backtracking(List<List<Integer>> result, int index, List<Integer> list, int[] nums) {

        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);

            list.add(nums[index]);
            backtracking(result, index + 1, list, nums);
            list.remove(list.size() - 1);

            swap(nums, i, index);

        }

    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
