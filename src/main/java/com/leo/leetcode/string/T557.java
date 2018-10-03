package com.leo.leetcode.string;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/description/
 */
public class T557 {
    public String reverseWords(String s) {
        if (s.length() == 0) {
            return s;
        }
        String[] strArr = s.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = reverseString(strArr[i]);
        }
        return String.join(" ",strArr);

    }

    private String reverseString(String s) {
        String[] strArr = s.split("");
        if (strArr.length < 2) {
            return s;
        }
        int left = 0;
        int right = strArr.length - 1;
        while (left < right) {
            String temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;
            left++;
            right--;
        }
        return String.join("", strArr);
    }
}
