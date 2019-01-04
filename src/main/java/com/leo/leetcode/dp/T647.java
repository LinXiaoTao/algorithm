package com.leo.leetcode.dp;

/**
 * 647. 回文子串
 * https://leetcode-cn.com/problems/palindromic-substrings/description/
 */
public class T647 {

    public int countSubstrings(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        int size = 0;

        // aaa
        for (int i = 0; i < s.length(); i++) {
            int pre = 1;
            int val = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (reverse(s.substring(i, j + 1))) {
                    // 回文
                    val = pre + 1;
                }
                pre = val;
            }
            size += val;
        }
        return size;
    }

    private boolean reverse(final String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public int countSubstrings1(String s) {
        int result = 0;
        if (s == null) {
            return result;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            result += count(s, i, i);
            result += count(s, i, i + 1);
        }
        return result;
    }

    private int count(String s, int beg, int end) {
        int count = 0;
        while (beg >= 0 && end < s.length() && s.charAt(beg) == s.charAt(end)) {
            count++;
            beg--;
            end++;
        }
        return count;
    }

}
