package com.leo.leetcode.design;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode-cn.com/problems/sliding-window-maximum/description/
 */
public class T239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> maxQueue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (maxQueue.isEmpty()) {
                maxQueue.addLast(i);
            } else {
                while (!maxQueue.isEmpty() && nums[maxQueue.getLast()] < nums[i]) {
                    maxQueue.pollLast();
                }
                maxQueue.addLast(i);
            }
            if (i >= (k - 1)) {
                result[i - (k - 1)] = nums[maxQueue.getFirst()];
            }
            if (maxQueue.getFirst() == (i + 1 - k)) {
                maxQueue.pollFirst();
            }
        }
        return result;
    }

}
