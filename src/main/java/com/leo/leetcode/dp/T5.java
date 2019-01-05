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
        // dp[i][j] 表示从 i 到 j 是否为回文字串
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i > -1; i--) {
            for (int j = i; j < s.length(); j++) {
                // aba 是回文，那么 c(aba)c 也是回文
                dp[i][j] = (s.charAt(i) == s.charAt(j))
                        && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && j - i + 1 > max.length()) {
                    max = s.substring(i, j + 1);
                }
            }
        }
        return max;
    }

    public String longestPalindrome2(String s) {
        if (s.length() < 2) {
            return s;
        }
        int[] ret = new int[2];
        for (int i = 0; i < s.length(); i++) {
            loop(ret, i, s);
        }
        return s.substring(ret[0], ret[1]);
    }

    private void loop(int[] ret, int low, String s) {
        int high = low;
        while (high < s.length() - 1 && s.charAt(high + 1) == s.charAt(low)) high++;
        while (high < s.length() && low >= 0 && s.charAt(low) == s.charAt(high)) {
            high++;
            low--;
        }
        if (high - low - 1 > ret[1] - ret[0]) {
            ret[0] = low + 1;
            ret[1] = high;
        }
    }

}
