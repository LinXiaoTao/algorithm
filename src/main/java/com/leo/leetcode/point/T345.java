package com.leo.leetcode.point;

/**
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
 */
public class T345 {

    public String reverseVowels(String s) {
        if (s.length() < 2) {
            return s;
        }
        String[] arr = s.split("");
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && !vowel(arr[left])) {
                left++;
            }
            while (left < right && !vowel(arr[right])) {
                right--;
            }
            if (left < right) {
                String temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        return String.join("", arr);
    }

    private boolean vowel(String s) {
        return s.equalsIgnoreCase("a") ||
                s.equalsIgnoreCase("e") ||
                s.equalsIgnoreCase("i") ||
                s.equalsIgnoreCase("o") ||
                s.equalsIgnoreCase("u");
    }

}
