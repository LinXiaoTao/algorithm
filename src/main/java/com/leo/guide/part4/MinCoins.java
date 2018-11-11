package com.leo.guide.part4;

/**
 * 题目：换钱的最少货币数
 * 给定数组 arr，arr 中所有的值都为正数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，
 * 再给定一个整数 aim 代表要找的钱数，求组成 aim 的最少货币数
 */
public class MinCoins {

    public static int minCoins1(int[] arr, int aim) {
        // 时间复杂度：O(arr.length * aim)，空间复杂度：O(arr.length * aim)
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        // dp[i][j] 表示 使用 arr[0..i] 的情况下，组成 j 的最少货币数
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 1; i <= aim; i++) {
            dp[0][i] = Integer.MAX_VALUE;
            int count;
            if (i - arr[0] >= 0 && (count = dp[0][i - arr[0]]) != Integer.MAX_VALUE) {
                dp[0][i] = count + 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                int max = Integer.MAX_VALUE;
                int count;
                if (j - arr[i] >= 0 && (count = dp[i][j - arr[i]]) != Integer.MAX_VALUE) {
                    max = count + 1;
                }
                dp[i][j] = Math.min(
                        max,
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
            int count;
            if (i - arr[0] >= 0 && (count = dp[i - arr[0]]) != Integer.MAX_VALUE) {
                dp[i] = count + 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                int max = Integer.MAX_VALUE;
                int count;
                if (j - arr[i] >= 0 && (count = dp[j - arr[i]]) != Integer.MAX_VALUE) {
                    max = count + 1;
                }
                dp[j] = Math.min(
                        max,
                        dp[j]
                );
            }
        }
        return dp[aim] != Integer.MAX_VALUE ? dp[aim] : -1;
    }

}
