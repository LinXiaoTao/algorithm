package com.leo.leetcode.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 740. 删除与获得点数
 * https://leetcode-cn.com/problems/delete-and-earn/description/
 */
public class T740 {

    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            countMap.put(
                    num,
                    countMap.getOrDefault(num, 0) + 1
            );
            max = Math.max(num, max);
        }
        int t1 = 0;
        int t2 = countMap.getOrDefault(1, 0);
        int t3 = 0;
        for (int i = 2; i <= max; i++) {
            t3 = Math.max(
                    countMap.getOrDefault(i, 0) * i + t1,
                    t2
            );
            t1 = t2;
            t2 = t3;
        }
        return t2;
    }

    public int deleteAndEarn1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int l = nums.length;
        int[] numCount = new int[10001];
        int max = 0;
        for (int i = 0; i < l; i++) {
            numCount[nums[i]]++;
            if (nums[i] > max) max = nums[i];
        }
        int t1 = 0;
        int t2 = numCount[1];
        int tmp = 0;
        for (int i = 2; i <= max; i++) {
            tmp = Math.max(t2, numCount[i] * i + t1);
            t1 = t2;
            t2 = tmp;
        }
        //当 nums 只存在元素 1 时，则只需直接返回 numCount[1] * 1
        return t2;
    }

}
