package com.leo.guide.part1;

import java.util.Stack;

/**
 * 题目：
 * 用一个栈实现另一个栈的排序
 * 要求：
 * 1. 只许申请一个栈
 */
public class SortStackByStack {


    public static void sortStackByStack(Stack<Integer> stack) {
        if (stack == null || stack.isEmpty()) {
            return;
        }
        Stack<Integer> sortStack = new Stack<>();

        while (!stack.isEmpty()) {
            Integer data = stack.pop();
            while (!sortStack.isEmpty() && data > sortStack.peek()) {
                stack.push(sortStack.pop());
            }
            sortStack.push(data);
        }

        while (!sortStack.isEmpty()) {
            stack.push(sortStack.pop());
        }
    }

}
