package com.leo.leetcode.point;

/**
 * https://leetcode-cn.com/problems/permutation-in-string/description/
 */
public class T567 {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] countArr = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            countArr[s1.charAt(i)]--;
        }
        // 无效指针
        int left = 0;
        // 有效指针
        int right = 0;
        // 有效字符数量
        int count = s1.length();
        while (right < s2.length()) {
            countArr[s2.charAt(right)]++;
            if (countArr[s2.charAt(right)] <= 0) {
                count--;
            }
            if (count == 0) {
                return true;
            }
            if (right - left == (s1.length() - 1)) {
                countArr[s2.charAt(left)]--;
                if (countArr[s2.charAt(left)] < 0) {
                    count++;
                }
                left++;
            }
            right++;
        }
        return false;
    }

}
