package com.leo.leetcode.arr;

/**
 * 189. 旋转数组
 * https://leetcode-cn.com/problems/rotate-array/solution/xuan-zhuan-shu-zu-by-leetcode/
 */
public class T189 {

    public void rotate(int[] nums, int k) {

        if (nums.length == 0) return;

        if (k > nums.length) k = k % nums.length;

        if (k == 0) return;

        // 全反转
        reverse(nums, 0, nums.length - 1);

        // k 前部分反转

        reverse(nums, 0, k - 1);

        // k 后部分反转

        reverse(nums, k, nums.length - 1);
    }

    public void rotate1(int[] nums, int k) {

        if (nums.length == 0) return;

        if (k > nums.length) k = k % nums.length;

        if (k == 0) return;


        int count = 0;
        int start = 0;
        while (count < nums.length) {

            int cur = start;
            int pre = nums[cur];

            do {
                int next = (cur + k) % nums.length;
                int temp = nums[next];
                nums[next] = pre;
                cur = next;
                pre = temp;
                count++;
            } while (cur != start);

            start++;
        }

    }

    private void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
