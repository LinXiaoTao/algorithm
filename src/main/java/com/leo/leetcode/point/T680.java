package com.leo.leetcode.point;

/**
 * 680. 验证回文字符串 Ⅱ
 * https://leetcode-cn.com/problems/valid-palindrome-ii/description/
 */
public class T680 {

    public boolean validPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        boolean del = false;
        int memoryLeft = -1;
        int memoryRight = -1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (memoryLeft != -1 && memoryRight != -1) {
                    left = memoryLeft;
                    right = memoryRight;
                    memoryLeft = -1;
                    memoryRight = -1;
                    continue;
                }
                if (del) {
                    return false;
                }
                if (left + 1 == right) {
                    return true;
                }
                left++;
                del = true;
                memoryLeft = left - 1;
                memoryRight = right - 1;
                continue;
            }
            left++;
            right--;
        }
        return true;
    }

}
