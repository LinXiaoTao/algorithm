package com.leo.leetcode.stack;

import java.util.Stack;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 */
public class T20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && (((int)s.charAt(i) - (int)stack.peek()) == 2 || ((int)s.charAt(i) - (int)stack.peek()) == 1)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

}
