package com.leo.guide.part1;

import java.util.Stack;

/**
 * 题目：
 * 设计一个有 GetMin 功能的栈
 * 要求：
 * 1. pop、push、getMin 操作的时间复杂度都是 O(1)
 */
public class GetMinStack<E extends Comparable<E>> {

    private final Stack<E> minStack = new Stack<>();
    private final Stack<E> dataStack = new Stack<>();

    public E getMin() {
        if (minStack.empty()) {
            return null;
        }
        return minStack.peek();
    }

    public void push(E data) {

        dataStack.push(data);
        if (minStack.empty()) {
            minStack.push(data);
        } else if (data.compareTo(minStack.peek()) <= 0) {
            // 小于或等于
            minStack.push(data);
        } else {
            // 复制栈顶元素入栈
            minStack.push(minStack.peek());
        }
    }

    public E pop() {
        minStack.pop();
        return dataStack.pop();
    }

    Stack<E> getMinStack() {
        return minStack;
    }

    Stack<E> getDataStack() {
        return dataStack;
    }
}
