package com.leo.leetcode.math;

/**
 * 942. 增减字符串匹配
 * https://leetcode-cn.com/problems/di-string-match/description/
 */
public class T942 {

    public int[] diStringMatch(String S) {
        if (S.length() == 0) {
            return new int[0];
        }
        int[] result = new int[S.length() + 1];
        int start = 0;
        int end = S.length();
        int index = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                // I
                result[index++] = start++;
            } else {
                // D
                result[index++] = end--;
            }
        }
        result[index] = start;
        return result;
    }

}
