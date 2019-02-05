package com.leo.leetcode.string;

/**
 * 522. 最长特殊序列 II
 * https://leetcode-cn.com/problems/longest-uncommon-subsequence-ii/
 */
public class T522 {

    public int findLUSlength(String[] strs) {
        int result = -1;
        for (int i = 0; i < strs.length; i++) {
            boolean sub = false;
            for (int j = 0; j < strs.length; j++) {
                if (i == j) continue;
                sub = sub(strs[i], strs[j]);
                if (sub) {
                    break;
                }
            }
            if (!sub) {
                result = Math.max(result, strs[i].length());
            }
        }
        return result;
    }

    /**
     * s1 是否为 s2 的子字符串
     */
    private boolean sub(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (s1.length() >= s2.length()) return false;
        int p = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(p) == s2.charAt(i)) {
                p++;
            }
            if (p == s1.length()) break;
        }
        return p == s1.length();
    }

}
