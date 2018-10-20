package com.leo.leetcode.dp;

/**
 * 516. 最长回文子序列
 * https://leetcode-cn.com/problems/longest-palindromic-subsequence/description/
 */
public class T516 {

    public int longestPalindromeSubseq(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int[][] dp = new int[s.length()][s.length()];

        // bbbab
        for (int i = s.length() - 1; i > -1; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(
                            dp[i][j - 1],
                            dp[i + 1][j]
                    );
                }
            }
        }
        return dp[0][s.length() - 1];
    }


}
