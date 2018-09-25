package com.leo.leetcode.design;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/description/
 */
public class T232 {

    private final Stack<Integer> pushStack = new Stack<>();
    private final Stack<Integer> popStack = new Stack<>();

    /**
     * Initialize your data structure here.
     */
    public T232() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        pushStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!popStack.isEmpty()) {
            return popStack.pop();
        }
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
        return popStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!popStack.isEmpty()) {
            return popStack.peek();
        }
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
        return popStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return popStack.isEmpty() && pushStack.isEmpty();
    }


}
