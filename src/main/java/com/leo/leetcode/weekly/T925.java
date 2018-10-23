package com.leo.leetcode.weekly;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 925. 长按键入
 * https://leetcode-cn.com/contest/weekly-contest-107/problems/long-pressed-name/
 */
public class T925 {

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() == 0 || typed.length() == 0) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                while (j < typed.length() && typed.charAt(j) != name.charAt(i)) {
                    j++;
                }
                if (j == typed.length()) {
                    return false;
                } else {
                    i++;
                    j++;
                }
            }
        }
        return i == name.length();
    }

}
