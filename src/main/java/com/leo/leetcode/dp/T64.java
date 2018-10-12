package com.leo.leetcode.dp;

/**
 * 64. 最小路径和
 * https://leetcode-cn.com/problems/minimum-path-sum/description/
 */
public class T64 {

    public int minPathSum(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;
        int[][] cache = new int[n][m];
        cache[0][0] = grid[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j > 0) {
                    if (i == 0) {
                        cache[i][j] = cache[i][j - 1] + grid[i][j];
                    } else {
                        cache[i][j] = Math.min(
                                cache[i - 1][j],
                                cache[i][j - 1]
                        ) + grid[i][j];
                    }
                } else {
                    // j == 0
                    if (i > 0) {
                        cache[i][j] = cache[i - 1][j] + grid[i][j];
                    }
                }
            }
        }
        return cache[n - 1][m - 1];
    }

}
