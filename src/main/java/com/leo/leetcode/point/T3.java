package com.leo.leetcode.point;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 */
public class T3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int max = 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);
        // 双指针
        int left = 0;
        int right = 0;
        while (++right < s.length()) {
            while (map.getOrDefault(s.charAt(right), 0) > 0 && left < right) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 1) - 1);
                left++;
            }
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}
