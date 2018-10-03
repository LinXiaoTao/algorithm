package com.leo.leetcode.point;

/**
 * 125. 验证回文串
 * https://leetcode-cn.com/problems/valid-palindrome/description/
 */
public class T125 {

    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && ((s.charAt(left) < 'a' || s.charAt(left) > 'z') && (s.charAt(left) < '0' || s.charAt(left) > '9'))) {
                left++;
            }
            while (left < right && ((s.charAt(right) < 'a' || s.charAt(right) > 'z') && (s.charAt(right) < '0' || s.charAt(right) > '9'))) {
                right--;
            }
            if (left < right) {
                if (s.charAt(left++) != s.charAt(right--)) {
                    return false;
                }
            }
        }
        return true;
    }

}
