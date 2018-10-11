package com.leo.leetcode.string;

/**
 * 709. 转换成小写字母
 * https://leetcode-cn.com/problems/to-lower-case/description/
 */
public class T709 {

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z') {
                // 大写
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return String.valueOf(chars);
    }

}
