package com.leo.leetcode.point;

/**
 * 75. 颜色分类
 * https://leetcode-cn.com/problems/sort-colors/description/
 */
public class T75 {

    public void sortColors(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        // 快排
        sort(nums, 0, nums.length - 1);
    }


    public void sortColors1(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        // 0 的指针
        int zero = -1;
        // 1 的指针
        int one = 0;
        // 2 的指针
        int two = nums.length;
        // 1 保持不动，0 移动到 zero，2 移动到 two
        while (one < two) {
            if (nums[one] == 0) {
                int temp = nums[++zero];
                nums[zero] = nums[one];
                nums[one++] = temp;
            } else if (nums[one] == 1) {
                one++;
            } else {
                // 2
                int temp = nums[--two];
                nums[two] = nums[one];
                nums[one] = temp;
            }
        }
    }

    private void sort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = getMid(nums, left, right);
            sort(nums, left, mid - 1);
            sort(nums, mid + 1, right);
        }
    }

    private int getMid(int[] nums, int left, int right) {
        int key = nums[left];
        while (left < right) {
            while (left < right && nums[right] > key) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
            }
            while (left < right && nums[left] <= key) {
                left++;
            }
            if (left < right) {
                nums[right] = nums[left];
            }
        }
        nums[left] = key;
        return left;
    }

}
