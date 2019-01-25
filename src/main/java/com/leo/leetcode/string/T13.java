package com.leo.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 * https://leetcode-cn.com/problems/roman-to-integer/description/
 */
public class T13 {

    public int romanToInt(String s) {
        if (s.isEmpty()) return 0;
        int result = 0;
        int index = 0;
        Map<String, Integer> map = new HashMap<>(13);
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        while (index < s.length()) {
            if ((index + 1) < s.length() && map.containsKey(s.substring(index, index + 2))) {
                // 特殊
                result += map.get(s.substring(index, index + 2));
                index += 2;
                continue;
            }
            result += map.get(s.substring(index, index + 1));
            index++;
        }
        return result;
    }

}
