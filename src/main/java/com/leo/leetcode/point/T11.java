package com.leo.leetcode.point;

/**
 * 11. 盛最多水的容器
 * https://leetcode-cn.com/problems/container-with-most-water/description/
 */
public class T11 {

    public int maxArea(int[] height) {
        int area = 0;
        if (height.length == 0) {
            return area;
        }
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            area = Math.max(
                    area,
                    Math.min(height[left], height[right]) * (right - left)
            );
            if (height[left] > height[right]) {
                int temp = height[right];
                while (left < right && height[right] <= temp) {
                    right--;
                }
            } else {
                int temp = height[left];
                while (left < right && height[left] <= temp) {
                    left++;
                }
            }
        }

        return area;
    }

}
