package com.leo.leetcode.map;

import java.util.ArrayList;
import java.util.List;

/**
 * 500. 键盘行
 * https://leetcode-cn.com/problems/keyboard-row/description/
 */
public class T500 {

    public String[] findWords(String[] words) {
        if (words.length == 0) {
            return new String[0];
        }
        List<String> stringList = new ArrayList<>();
        int[] map = new int[26];

        map[0] = 1;
        map[1] = 2;
        map[2] = 2;
        map[3] = 1;
        map[4] = 0;
        map[5] = 1;
        map[6] = 1;

        // h i j k l m n
        map[7] = 1;
        map[8] = 0;
        map[9] = 1;
        map[10] = 1;
        map[11] = 1;
        map[12] = 2;
        map[13] = 2;

        // o p q r s t
        map[14] = 0;
        map[15] = 0;
        map[16] = 0;
        map[17] = 0;
        map[18] = 1;
        map[19] = 0;

        // u v w x y z
        map[20] = 0;
        map[21] = 2;
        map[22] = 0;
        map[23] = 2;
        map[24] = 0;
        map[25] = 2;


        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int index = map[word.charAt(0) - 'a'];
            boolean can = true;
            for (int j = 1; j < word.length(); j++) {
                if (index != map[word.charAt(j) - 'a']) {
                    can = false;
                    break;
                }
            }
            if (can) {
                stringList.add(words[i]);
            }
        }

        return stringList.toArray(new String[stringList.size()]);
    }

}
