package com.leo.leetcode.point;

/**
 * https://leetcode-cn.com/problems/minimum-window-substring/description/
 */
public class T76 {

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        int[] countMap = new int[256];
        for (int i = 0; i < t.length(); i++) {
            countMap[t.charAt(i)]--;
        }
        // 无效指针
        int left = 0;
        // 有效指针
        int right = 0;
        // 有效字符数量
        int count = t.length();
        String result = "";
        while (right < s.length()) {
            countMap[s.charAt(right)]++;
            if (countMap[s.charAt(right)] <= 0) {
                count--;
            }
            while (count == 0) {
                if (result.isEmpty()) {
                    result = s.substring(left, right + 1);
                } else if (s.substring(left, right + 1).length() < result.length()) {
                    result = s.substring(left, right + 1);
                }
                if (countMap[s.charAt(left)] == 0) {
                    // 必定为目标元素之一
                    count++;
                }
                countMap[s.charAt(left)]--;
                left++;
            }
            right++;
        }
        return result;
    }

}
