package com.leo.guide.part1;

import java.util.Stack;

/**
 * 题目：
 * 由两个栈实现队列
 */
public class TwoStackQueue<E> {

    private final Stack<E> popStack = new Stack<>();
    private final Stack<E> pushStack = new Stack<>();

    public void add(E data) {
        pushStack.push(data);
    }

    public E poll() {
        if (!popStack.empty()) {
            return popStack.pop();
        }

        while (!pushStack.empty()) {
            popStack.push(pushStack.pop());
        }

        return popStack.pop();
    }

    public E peek() {
        if (!popStack.empty()) {
            return popStack.peek();
        }

        while (!pushStack.empty()) {
            popStack.push(pushStack.pop());
        }

        return popStack.peek();
    }

}
