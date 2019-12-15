package com.leo.leetcode.map;

/**
 * 387. 字符串中的第一个唯一字符
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class T387 {

    public int firstUniqChar(String s) {
        int[] cache = new int[26];
        for(int i = 0; i < s.length(); i++) {
            cache[s.charAt(i) - 'a'] = cache[s.charAt(i) - 'a'] + 1;
        }

        for(int i = 0; i < s.length(); i++) {
            if(cache[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;

    }
}
