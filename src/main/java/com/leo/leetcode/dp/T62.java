package com.leo.leetcode.dp;

/**
 * 62. 不同路径
 * https://leetcode-cn.com/problems/unique-paths/description/
 */
public class T62 {

    public int uniquePaths(int m, int n) {
        // dp[i][j] 从 [0][0] 到达 [i][j] 有多少种路径
        // dp[i][j] = dp[i-][j] + dp[i][j-1]
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}
