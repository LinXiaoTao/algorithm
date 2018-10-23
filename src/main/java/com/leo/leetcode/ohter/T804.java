package com.leo.leetcode.ohter;

import java.util.HashMap;
import java.util.Map;

/**
 * 804. 唯一摩尔斯密码词
 * https://leetcode-cn.com/problems/unique-morse-code-words/description/
 */
public class T804 {

    public int uniqueMorseRepresentations(String[] words) {

        final String[] wordsMap = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        Map<String, Integer> countMap = new HashMap<>();


        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                stringBuilder.append(
                        wordsMap[words[i].charAt(j) - 'a']
                );
            }
            countMap.put(
                    stringBuilder.toString(),
                    1
            );
        }

        return countMap.size();
    }


}
