package com.leo.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 38. 报数`
 * https://leetcode-cn.com/problems/count-and-say/description/
 */
public class T38 {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        int start = 1;
        String startText = "1";
        while (start < n) {
            startText = calculate(startText);
            start++;
        }
        return startText;
    }

    private String calculate(String text) {
        if (text.isEmpty()) return "";
        int start = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (start < text.length()) {
            String current = text.substring(start, start + 1);
            int count = 1;
            start++;
            while (start < text.length() && current.equals(text.substring(start, start + 1))) {
                count++;
                start++;
            }
            stringBuilder.append(count + current);
        }
        return stringBuilder.toString();
    }

}
