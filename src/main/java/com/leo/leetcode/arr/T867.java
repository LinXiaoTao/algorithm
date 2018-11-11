package com.leo.leetcode.arr;

/**
 * 867. 转置矩阵
 * https://leetcode-cn.com/problems/transpose-matrix/description/
 */
public class T867 {

    public int[][] transpose(int[][] A) {
        if (A.length == 0 || A[0].length == 0) {
            return new int[0][0];
        }

        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;

    }

}
