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

    public String longestPalindrome3(String s) {
        if (s.length() < 2) {
            return s;
        }
        StringBuilder builder = new StringBuilder();
        builder.append("#");
        for (int i = 0; i < s.length(); i++) {
            builder.append(s, i, i + 1);
            builder.append("#");
        }
        s = builder.toString();
        int[] dp = new int[s.length()];
        builder.delete(0, builder.length());

        int maxRight = 0;
        int maxLen = 0;
        int pos = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i < maxRight) {
                dp[i] = Math.min(dp[2 * pos - i], maxRight - i + 1);
            } else {
                dp[i] = 1;
            }

            while (i + dp[i] < s.length() && i - dp[i] >= 0 && s.charAt(i + dp[i]) == s.charAt(i - dp[i])) {
                dp[i] += 1;
            }

            if (i + dp[i] - 1 > maxRight) {
                maxRight = i + dp[i] - 1;
                pos = i;
            }

            maxLen = Math.max(maxLen, dp[i]);
            if (maxLen == dp[i]) {
                if (builder.length() > 0) {
                    builder.delete(0, builder.length());
                }
                builder.append(s, i - dp[i] + 1, i + dp[i]);
            }

        }

        return builder.toString().replace("#", "");

    }

}
