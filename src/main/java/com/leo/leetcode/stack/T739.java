package com.leo.leetcode.stack;

import java.util.Stack;

/**
 * 739. 每日温度
 * https://leetcode-cn.com/problems/daily-temperatures/description/
 */
public class T739 {


    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int cur = stack.pop();
                result[cur] = i - cur;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            result[stack.pop()] = 0;
        }
        return result;
    }

}
