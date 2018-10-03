package com.leo.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/backspace-string-compare/description/
 */
public class T844 {

    public boolean backspaceCompare(String S, String T) {
        Stack<String> s = new Stack<>();
        Stack<String> t = new Stack<>();
        String[] sArr = S.split("");
        String[] tArr = T.split("");
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].equals("#")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
                continue;
            }
            s.push(sArr[i]);
        }
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i].equals("#")) {
                if (!t.isEmpty()) {
                    t.pop();
                }
                continue;
            }
            t.push(tArr[i]);
        }
        if (s.size() != t.size()) {
            return false;
        }
        while (!s.isEmpty()) {
            if (!s.pop().equals(t.pop())) {
                return false;
            }
        }
        return true;
    }
}
