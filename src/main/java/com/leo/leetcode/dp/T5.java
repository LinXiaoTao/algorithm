package com.leo.leetcode.dp;

/**
 * 5. 最长回文子串
 * https://leetcode-cn.com/problems/longest-palindromic-substring/description/
 */
public class T5 {


    public String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        String max = s.substring(0, 1);
        // babad => bab || aba
        // cbbd => bb
        // dp[i][j] 表示从 i 到 j 最长的回文字串
        String[][] dp = new String[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = s.substring(i, i + 1);
        }
        for (int i = s.length() - 1; i > -1; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                // [0][1] [0][2] ...
                // [1][2]
                // ...
                if (s.charAt(i) == s.charAt(j)) {
                    if ((dp[i + 1][j - 1] == null) && (i + 1 < j - 1)) {
                        continue;
                    }
                    if (dp[i + 1][j - 1] == null) {
                        dp[i + 1][j - 1] = "";
                    }
                    dp[i][j] = s.substring(j, j + 1) + dp[i + 1][j - 1] + s.substring(j, j + 1);
                    max = (dp[i][j].length() > max.length()) ? dp[i][j] : max;
                }
            }
        }
        return max;
    }

}
