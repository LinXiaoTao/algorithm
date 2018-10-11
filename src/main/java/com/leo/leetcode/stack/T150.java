package com.leo.leetcode.stack;

import java.util.Stack;

/**
 * 150. 逆波兰表达式求值
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/description/
 */
public class T150 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].charAt(0) >= '0' && tokens[i].charAt(0) <= '9' ||
                    (tokens[i].charAt(0) == '-' && tokens[i].length() > 1)) {
                // 数字
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                // 运算符号
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                }
            }
        }
        return stack.pop();
    }


}
