package com.leo.leetcode.dp;

/**
 * 343. 整数拆分
 * https://leetcode-cn.com/problems/integer-break/description/
 */
public class T343 {

    public int integerBreak(int n) {
        // 10 => 3 × 3 × 4 = 36
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = 0;
            for (int j = 2; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }

    public int integerBreak1(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;
        int LG_3 = n / 3;
        if (n % 3 == 2) {
            return (int) Math.pow((double) 3, (double) LG_3) * 2;
        }
        if (n % 3 == 1) {
            return (int) Math.pow((double) 3, (double) (LG_3 - 1)) * 4;
        }
        return (int) Math.pow((double) 3, (double) LG_3);

    }

}
