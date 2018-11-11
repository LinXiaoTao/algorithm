package com.leo.guide.part4;

/**
 * 题目：矩阵的最小路径和
 * 给定一个矩阵 m，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，
 * 返回所有的路径中最小的路径和
 */
public class MinPathSum {

    public static int minPathSum1(int[][] m) {
        // 时间复杂度：O(M * N)，空间复杂度：O(M * N)
        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
            return 0;
        }
        int row = m.length;
        int col = m[0].length;
        // dp[i][j] 表示到达 m[i][j] 最小路径和
        int[][] dp = new int[row][col];
        dp[0][0] = m[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + m[i][0];
        }
        for (int i = 1; i < col; i++) {
            dp[0][i] = dp[0][i - 1] + m[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(
                        dp[i - 1][j],
                        dp[i][j - 1]
                ) + m[i][j];
            }
        }
        return dp[row - 1][col - 1];
    }

    public static int minPathSum2(int[][] m) {
        // 优化版本，时间复杂度不变，空间复杂度：O(min(M,N))
        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
            return 0;
        }
        int more = Math.max(m.length, m[0].length);
        int less = Math.min(m.length, m[0].length);
        boolean rowMore = more == m.length;
        int[] dp = new int[less];
        dp[0] = m[0][0];
        for (int i = 1; i < less; i++) {
            dp[i] = dp[i - 1] + (rowMore ? m[0][i] : m[i][0]);
        }
        for (int i = 1; i < more; i++) {
            dp[0] = dp[0] + (rowMore ? m[i][0] : m[0][i]);
            for (int j = 1; j < less; j++) {
                dp[j] = Math.min(
                        dp[j - 1],
                        dp[j]
                ) + (rowMore ? m[i][j] : m[j][i]);
            }
        }
        return dp[less - 1];
    }


}
