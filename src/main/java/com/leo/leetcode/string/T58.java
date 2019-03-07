package com.leo.leetcode.string;

/**
 * 58. 最后一个单词的长度
 * https://leetcode-cn.com/problems/length-of-last-word/
 */
public class T58 {

    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int index = s.length() - 1;
        int size = 0;
        while (index >= 0) {
            char ch = s.charAt(index);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // 字母
                size++;
            }else {
                if (size > 0){
                    break;
                }
            }
            index--;

        }
        return size;
    }

}
