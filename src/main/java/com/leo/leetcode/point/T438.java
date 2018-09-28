package com.leo.leetcode.point;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/description/
 */
public class T438 {


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        int[] countArr = new int[256];
        for (int i = 0; i < p.length(); i++) {
            countArr[p.charAt(i)]--;
        }
        // 无效指针
        int left = 0;
        // 有效指针
        int right = 0;
        // 有效字符数量
        int count = p.length();
        while (right < s.length()) {
            // 有效字符数 +1
            countArr[s.charAt(right)]++;
            if (countArr[s.charAt(right)] <= 0) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == (p.length() - 1)) {
                countArr[s.charAt(left)]--;
                if (countArr[s.charAt(left)] < 0){
                    count++;
                }
                left++;
            }
            right++;
        }
        return result;
    }


}
