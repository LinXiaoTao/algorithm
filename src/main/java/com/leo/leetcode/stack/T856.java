package com.leo.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * 856. 括号的分数
 * https://leetcode-cn.com/problems/score-of-parentheses/description/
 */
public class T856 {

    public int scoreOfParentheses(String S) {
        // (())
        Stack<String> stack = new Stack<>();
        int index = 0;
        while (index < S.length()) {
            if (S.charAt(index) == '(') {
                stack.push("(");
            } else {
                // )
                String val = stack.pop();
                if (val.equals("(")) {
                    stack.push("1");
                } else {
                    int value = Integer.parseInt(val);
                    while (true) {
                        if (stack.isEmpty()) {
                            break;
                        }
                        String popVal = stack.pop();
                        if (popVal.equals("(")) {
                            // 闭合
                            stack.push(String.valueOf(value * 2));
                            break;
                        } else {
                            value += Integer.parseInt(popVal);
                        }
                    }
                }
            }
            index++;
        }
        int sum = 0;
        for (String str : stack) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }

    public int scoreOfParentheses1(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }
        int score = 0;
        int unMatchLeft = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                unMatchLeft++;
            } else {
                unMatchLeft--;
                if (S.charAt(i - 1) == '(') {
                    // 根据乘法分配律，有”(()(()))” = 2*(1 + 2*1) = 2*1 + 2*2*1 = (()) + ((()))。
                    score += 1 << unMatchLeft;   //嵌套层数倍数
                }
            }

        }
        return score;
    }

}
