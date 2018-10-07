package com.leo.leetcode.stack;

import java.util.Stack;

/**
 * 503. 下一个更大元素 II
 * https://leetcode-cn.com/problems/next-greater-element-ii/description/
 */
public class T503 {

    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        boolean join = true;
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            }
            if (!stack.isEmpty() && stack.peek() == i) {
                result[stack.pop()] = -1;
            }
            if (join){
                stack.push(i);
            }
            if (i == (nums.length - 1) && !stack.isEmpty()) {
                join = false;
                i = -1;
            }
        }
        return result;
    }

}
