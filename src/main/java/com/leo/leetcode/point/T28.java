package com.leo.leetcode.point;

/**
 * 28. 实现strStr()
 * https://leetcode-cn.com/problems/implement-strstr/description/
 */
public class T28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        while (j < haystack.length()) {

            if ((j - i) == (needle.length() - 1)) {
                if (needle.equals(haystack.substring(i, j + 1))) {
                    return i;
                }
                i++;
            }
            j++;
        }
        return -1;
    }
}
