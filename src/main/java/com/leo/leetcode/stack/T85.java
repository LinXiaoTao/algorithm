package com.leo.leetcode.stack;

import java.util.Stack;

/**
 * 85. 最大矩形
 * https://leetcode-cn.com/problems/maximal-rectangle/description/
 */
public class T85 {

    public int maximalRectangle(char[][] matrix) {
        int area = 0;
        if (matrix.length == 0) {
            return 0;
        }
        int[] heights = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                heights[j] = matrix[i][j] == '1' ? heights[j] + 1 : 0;
            }
            area = Math.max(area, calculate(heights));
        }
        return area;
    }

    private int calculate(int[] height) {
        int area = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (height[i] > height[stack.peek()]) {
                    stack.push(i);
                } else {
                    int k = -1;
                    int j = stack.pop();
                    if (!stack.isEmpty()) {
                        k = stack.peek();
                    }
                    area = Math.max(area, (i - k - 1) * height[j]);
                    while (!stack.isEmpty() && height[i] <= height[stack.peek()]) {
                        k = -1;
                        j = stack.pop();
                        if (!stack.isEmpty()) {
                            k = stack.peek();
                        }
                        area = Math.max(area, (i - k - 1) * height[j]);
                    }
                    stack.push(i);
                }
            }
        }

        while (!stack.isEmpty()) {
            int k = -1;
            int j = stack.pop();
            if (!stack.isEmpty()) {
                k = stack.peek();
            }
            area = Math.max(area, (j - k) * height[j]);
        }

        return area;
    }

}
