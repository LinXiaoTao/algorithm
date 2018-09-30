package com.leo.leetcode.point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words/description/
 */
public class T30 {

    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>(words.length);
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            wordsMap.put(word, wordsMap.containsKey(word) ? wordsMap.get(word) + 1 : 1);
        }
        int len = words[0].length();
        for (int i = 0; i < len; i++) {
            int start = i;
            int count = 0;
            Map<String, Integer> currMap = new HashMap<>();
            for (int j = i; j <= s.length() - len; j += len) {
                String subString = s.substring(j, j + len);
                if (wordsMap.containsKey(subString)) {
                    currMap.put(subString, currMap.containsKey(subString) ? currMap.get(subString) + 1 : 1);
                    count++;
                    while (currMap.get(subString) > wordsMap.get(subString)) {
                        String leftSubString = s.substring(start, start + len);
                        currMap.put(leftSubString, currMap.get(leftSubString) - 1);
                        start += len;
                        count--;
                    }
                    if (count == words.length) {
                        // 已符合规则
                        String leftSubString = s.substring(start, start + len);
                        currMap.put(leftSubString, currMap.get(leftSubString) - 1);
                        result.add(start);
                        start += len;
                        count--;
                    }
                } else {
                    // 存在不匹配，不符合连续规则
                    currMap.clear();
                    start = j + len;
                    count = 0;
                }
            }
        }
        return result;
    }

}
