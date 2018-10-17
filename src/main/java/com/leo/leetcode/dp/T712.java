package com.leo.leetcode.dp;

/**
 * 712. 两个字符串的最小ASCII删除和
 * https://leetcode-cn.com/problems/minimum-ascii-delete-sum-for-two-strings/description/
 */
public class T712 {

    public int minimumDeleteSum(String s1, String s2) {
        // delete leet
        // dee e => let
        // dp[i][j] 表示 维持 [1,i] 和 [1,j] 相同最小 ASCII 删除和
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int i = 1; i <= s2.length(); i++) {
            dp[0][i] = dp[0][i - 1] + s2.charAt(i - 1);
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(
                            dp[i - 1][j] + s1.charAt(i - 1),
                            dp[i][j - 1] + s2.charAt(j - 1)
                    );
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

}
