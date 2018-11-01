package com.leo.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 929. 独特的电子邮件地址
 * https://leetcode-cn.com/problems/unique-email-addresses/description/
 */
public class T929 {

    public int numUniqueEmails(String[] emails) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < emails.length; i++) {
            map.put(
                    process(emails[i]),
                    Boolean.TRUE
            );
        }
        return map.keySet().size();
    }

    private String process(String source) {
        int index = 0;
        String handle = source.substring(
                0,
                (index = source.indexOf('@'))
        );
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < handle.length(); i++) {
            char c = handle.charAt(i);
            if (c == '+') {
                break;
            }
            if (c == '.') {
                continue;
            }
            builder.append(c);
        }
        builder.append(
                source.substring(index)
        );
        return builder.toString();
    }

}
