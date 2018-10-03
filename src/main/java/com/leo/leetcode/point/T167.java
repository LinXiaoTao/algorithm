package com.leo.leetcode.point;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class T167 {

    // 13 ms
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return new int[]{map.get(numbers[i]), i + 1};
            } else {
                map.put(target - numbers[i], i + 1);
            }
        }
        return new int[]{};
    }

    // 1 ms
    public int[] twoSum1(int[] numbers, int target) {
        if (numbers.length < 2) {
            return new int[]{};
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right + 1};
    }

}
