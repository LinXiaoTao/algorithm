package com.leo.guide.part4;


/**
 * 题目：换钱的最少货币数（补充题目）
 * 给定数组 arr，arr 中所有的值都为正数。每个值代表一张钱的面值，
 * 再给定一个整数 aim 代表要找的钱数，求组成 aim 的最少货币数
 */
public class MinCoinsExpansion {

    public static int minCoins1(int[] arr, int aim) {
        // 时间复杂度：O(M * N)，空间复杂度：O(M * N)
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        // dp[i][j] 表示在任意使用 arr[0..i] 货币的情况，组成 j 的最少货币数
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 1; i <= aim; i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }
        if (arr[0] <= aim) {
            dp[0][arr[0]] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                int min = Integer.MAX_VALUE;
                // 区别
                if (j - arr[i] >= 0 && dp[i - 1][j - arr[i]] != Integer.MAX_VALUE) {
                    min = dp[i - 1][j - arr[i]] + 1;
                }
                dp[i][j] = Math.min(
                        min,
                        dp[i - 1][j]
                );
            }
        }
        return dp[arr.length - 1][aim] != Integer.MAX_VALUE ? dp[arr.length - 1][aim] : -1;
    }

    public static int minCoins2(int[] arr, int aim) {
        // 时间复杂度：O(arr.length * aim)，空间复杂度：O(aim)
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        int[] dp = new int[aim + 1];
        for (int i = 1; i <= aim; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        if (arr[0] <= aim) {
            dp[arr[0]] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            // 区别
            for (int j = aim; j > 0; j--) {
                int min = Integer.MAX_VALUE;
                if (j - arr[i] >= 0 && dp[j - arr[i]] != Integer.MAX_VALUE) {
                    min = dp[j - arr[i]] + 1;
                }
                dp[j] = Math.min(
                        min,
                        dp[j]
                );
            }
        }
        return dp[aim] != Integer.MAX_VALUE ? dp[aim] : -1;
    }

}
