package com.leo.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 242. 有效的字母异位词
 * https://leetcode-cn.com/problems/valid-anagram/description/
 */
public class T242 {

    public boolean isAnagram(String s, String t) {
        String max = s.length() > t.length() ? s : t;
        String min = s.equals(max) ? t : s;
        List<Character> characters = new ArrayList<>(max.length());
        for (int i = 0; i < max.length(); i++) {
            characters.add(max.charAt(i));
        }
        for (int i = 0; i < min.length(); i++) {
            characters.remove(Character.valueOf(min.charAt(i)));
        }
        return characters.isEmpty();
    }
}
