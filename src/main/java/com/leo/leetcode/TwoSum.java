package com.leo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/two-sum/description/">two-sum</a>
 */
public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        final Map<Integer, String> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            String insert = map.get(value);
            if (insert == null) {
                insert = String.valueOf(i);
            } else {
                insert += "," + String.valueOf(i);
            }

            map.put(value, insert);
        }
        // 快排
        quickSort(nums);
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            // 二分查找
            String sourceIndex = map.get(value);
            int firstIndex = Integer.parseInt(sourceIndex.split(",")[0]);
            int searchIndex = binarySearch(nums, i, target - value);
            if (searchIndex > -1) {
                sourceIndex = map.get(nums[searchIndex]);
                for (String index : sourceIndex.split(",")) {
                    if (Integer.parseInt(index) != firstIndex) {
                        return new int[]{firstIndex, Integer.parseInt(index)};
                    }
                }

            }
        }
        return new int[2];
    }

    private static void quickSort(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        sort(nums, 0, nums.length - 1);

    }

    private static void sort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = getMid(nums, start, end);
            sort(nums, start, mid - 1);
            sort(nums, mid + 1, end);
        }
    }

    private static int getMid(int[] nums, int start, int end) {
        int temp = nums[start];
        while (start < end) {
            while (start < end && nums[end] >= temp) {
                end--;
            }
            nums[start] = nums[end];
            while (start < end && nums[start] < temp) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = temp;
        return start;
    }

    private static int binarySearch(int[] nums, int start, int target) {
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            int midVal = nums[mid];
            if (target > midVal) {
                start = mid + 1;
            } else if (target < midVal) {
                end = mid - 1;
            } else {
                // find
                return mid;
            }
        }
        // not find
        return -1;
    }

}
