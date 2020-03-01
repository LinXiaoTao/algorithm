package com.leo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 * https://leetcode-cn.com/problems/combinations/
 */
public class T77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine(result, new ArrayList<>(), n, k);
        return result;
    }

    private void combine(List<List<Integer>> result, List<Integer> temp, int index, int k) {

        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i >= 1; i--) {

            temp.add(i);
            combine(result, temp, i - 1, k);
            temp.remove(temp.size() - 1);
        }

    }
}
