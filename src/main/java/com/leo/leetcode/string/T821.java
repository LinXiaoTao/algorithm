package com.leo.leetcode.string;

/**
 * 821. 字符的最短距离
 * https://leetcode-cn.com/problems/shortest-distance-to-a-character/description/
 */
public class T821 {

    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == C) {
                result[i] = 0;
                continue;
            }
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 || right < S.length()) {
                if (left >= 0) {
                    if (S.charAt(left) == C) {
                        result[i] = i - left;
                        break;
                    }
                }
                if (right < S.length()) {
                    if (S.charAt(right) == C) {
                        result[i] = right - i;
                        break;
                    }
                }
                left--;
                right++;
            }
        }
        return result;
    }

}
