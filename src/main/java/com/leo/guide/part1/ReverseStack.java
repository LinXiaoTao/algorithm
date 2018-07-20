package com.leo.guide.part1;

import java.util.Stack;

/**
 * 题目：
 * 如何仅使用递归函数和栈操作逆序一个栈
 */
public class ReverseStack {


    private static <E> E getAndRemoveLastElement(Stack<E> stack) {
        E data = stack.pop();
        if (stack.isEmpty()) {
            return data;
        } else {
            E last = getAndRemoveLastElement(stack);
            stack.push(data);
            return last;
        }
    }

    public static <E> void reverse(Stack<E> stack) {
        if (stack.isEmpty()) {
            return;
        }
        E last = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(last);
    }

}
