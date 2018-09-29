package com.leo.guide.part1;

import java.util.Stack;

/**
 * 题目：
 * 给定一个整型矩阵 map,其中的值只有 0 和 1 两种，求其中全是 1 的所有矩阵区域中，最大的矩阵区域为 1 的数量
 */
public class MaxRectSize {

    public static int maxRectSize(int[][] map) {
        int maxArea = 0;
        int[] height = new int[map[0].length];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                height[j] = map[i][j] == 1 ? height[j] + 1 : 0;
            }
            maxArea = Math.max(maxRectFromBottom(height), maxArea);
        }
        return maxArea;
    }


    private static int maxRectFromBottom(int[] height) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                int j = stack.pop();
                int k = -1;
                if (!stack.isEmpty()) {
                    k = stack.peek();
                }
                // 计算 j
                maxArea = Math.max(maxArea, (i - k - 1) * height[j]);
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int j = stack.pop();
            int k = -1;
            if (!stack.isEmpty()) {
                k = stack.peek();
            }
            // 计算 j
            maxArea = Math.max(maxArea, (height.length - k - 1) * height[j]);
        }
        return maxArea;
    }

}
