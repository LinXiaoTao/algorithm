package com.leo.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. 同构字符串
 * https://leetcode-cn.com/problems/isomorphic-strings/description/
 */
public class T205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        Map<Character, Character> map = new HashMap<>();
        int index = 0;
        while (index < s.length()) {
            Character c1 = s.charAt(index);
            Character c2 = t.charAt(index);
            if (map.containsKey(c1)) {
                if (!map.get(c1).equals(c2)) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)){
                    return false;
                }
                map.put(c1, c2);
            }
            index++;
        }
        return true;
    }

    public boolean isIsomorphic1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] map1 = new int[128];
        int[] map2 = new int[128];
        for (int i = 0; i < s.length(); i++) {
            map1[s.charAt(i)] = i;
            map2[t.charAt(i)] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
        }
        return true;
    }

}
