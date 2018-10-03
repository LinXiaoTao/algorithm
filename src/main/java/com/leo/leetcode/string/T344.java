package com.leo.leetcode.string;

/**
 * https://leetcode-cn.com/problems/reverse-string/description/
 */
public class T344 {


    public String reverseString(String s) {
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
