package com.leo.leetcode.string;

/**
 * https://leetcode-cn.com/problems/reverse-string-ii/description/
 */
public class T541 {

    public String reverseStr(String s, int k) {
        if (s.length() < 2) {
            return s;
        }
        String[] strArr = s.split("");
        for (int i = 0; i < strArr.length; i += 2 * k) {
            int left = i;
            int right = Math.min(left + k - 1, strArr.length - 1);
            while (left < right) {
                String temp = strArr[left];
                strArr[left] = strArr[right];
                strArr[right] = temp;
                left++;
                right--;
            }
        }

        return String.join("", strArr);

    }
}
