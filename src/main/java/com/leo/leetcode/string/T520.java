package com.leo.leetcode.string;

/**
 * 520. 检测大写字母
 * https://leetcode-cn.com/problems/detect-capital/
 */
public class T520 {

    public boolean detectCapitalUse(String word) {
        return word.toLowerCase().equals(word) || word.toUpperCase().equals(word) || word.equals(toTitleCase(word));
    }

    private String toTitleCase(String word) {
        word = word.toLowerCase();

        return String.valueOf(((char) (word.codePointAt(0) - 32))) + word.substring(1);
    }

}
