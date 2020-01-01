package com.leo.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 227. 基本计算器 II
 * https://leetcode-cn.com/problems/basic-calculator-ii/
 */
public class T227 {

    public int calculate(String s) {

        Deque<String> stack = new LinkedList<>();

        boolean calculate = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') continue;

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                int startIndex = i;
                while ((i + 1) < s.length() && (s.charAt((i + 1)) >= '0' && s.charAt(i) <= '9')) {
                    i++;
                }
                String number2 = s.substring(startIndex, i + 1);

                if (calculate) {
                    calculate = false;
                    String flag = stack.pollLast();
                    String number1 = stack.pollLast();
                    stack.offerLast(String.valueOf(calculate(number1, number2, flag)));
                } else {
                    stack.offerLast(number2);
                }
            } else {
                if (s.charAt(i) == '*' || s.charAt(i) == '/') {
                    calculate = true;
                }
                stack.offerLast(s.substring(i, i + 1));
            }

        }


        while (stack.size() > 1) {
            String number1 = stack.pollFirst();
            String flag = stack.pollFirst();
            String number2 = stack.pollFirst();
            stack.push(String.valueOf(calculate(number1, number2, flag)));
        }

        return Integer.valueOf(stack.pollFirst());

    }


    private int calculate(String number1, String number2, String flag) {
        switch (flag) {
            case "+":
                return Integer.valueOf(number1) + Integer.valueOf(number2);
            case "-":
                return Integer.valueOf(number1) - Integer.valueOf(number2);
            case "*":
                return Integer.valueOf(number1) * Integer.valueOf(number2);
            case "/":
                return Integer.valueOf(number1) / Integer.valueOf(number2);
        }
        return 0;
    }

    public int calculate1(String s) {

        // 后缀表达式
        Queue<String> backExp = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') continue;

            if (isNumber(s.charAt(i))) {
                // 连续数字
                int start = i;
                while ((i + 1) < s.length() && isNumber(s.charAt(i + 1))) {
                    i++;
                }
                backExp.offer(s.substring(start, i + 1));
            } else {
                // 符号

                if (s.charAt(i) == '+' || s.charAt(i) == '-') {

                    while (stack.size() > 0) {
                        backExp.offer(stack.pop());
                    }
                    stack.push(String.valueOf(s.charAt(i)));

                } else {

                    while (stack.size() > 0 && (stack.peek().equals("*") || stack.peek().equals("/"))) {
                        backExp.offer(stack.pop());
                    }
                    stack.push(String.valueOf(s.charAt(i)));

                }


            }


        }

        while (stack.size() > 0) {
            backExp.offer(stack.pop());
        }

        // 计算
        while (backExp.size() > 0) {
            if (isNumber(backExp.peek())) {
                stack.push(backExp.poll());
            } else {
                String flag = backExp.poll();
                stack.push(String.valueOf(calculate1(stack.pop(), stack.pop(), flag)));

            }
        }

        return Integer.valueOf(stack.pop());

    }

    private boolean isNumber(String c) {
        for (int i = 0; i < c.length(); i++) {
            if (!isNumber(c.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private int calculate1(String number1, String number2, String flag) {
        switch (flag) {
            case "+":
                return Integer.valueOf(number1) + Integer.valueOf(number2);
            case "-":
                return Integer.valueOf(number2) - Integer.valueOf(number1);
            case "*":
                return Integer.valueOf(number1) * Integer.valueOf(number2);
            case "/":
                return Integer.valueOf(number2) / Integer.valueOf(number1);
        }
        return 0;
    }

}
