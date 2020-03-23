package com.leo.offer;

/**
 * 面试题04. 二维数组中的查找
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class T4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int x = matrix[0].length - 1;
        int y = 0;
        while (x >= 0 && y < matrix.length) {
            if (matrix[y][x] == target) {
                return true;
            } else if (matrix[y][x] > target) {
                x--;
            } else {
                y++;
            }
        }
        return false;
    }
}
