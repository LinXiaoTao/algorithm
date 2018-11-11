package com.leo.leetcode.dp;

/**
 * 322. 零钱兑换
 * https://leetcode-cn.com/problems/coin-change/description/
 */
public class T322 {

    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0 || amount <= 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            if (i >= coins[0] && dp[i - coins[0]] != Integer.MAX_VALUE) {
                dp[i] = dp[i - coins[0]] + 1;
            }
        }
        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                int max = Integer.MAX_VALUE;
                if (j >= coins[i] && dp[j - coins[i]] != Integer.MAX_VALUE) {
                    max = dp[j - coins[i]] + 1;
                }
                dp[j] = Math.min(
                        max,
                        dp[j]
                );
            }
        }
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;

    }

}
