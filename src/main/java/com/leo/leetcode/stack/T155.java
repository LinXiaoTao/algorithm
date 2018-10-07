package com.leo.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 155. 最小栈
 * https://leetcode-cn.com/problems/min-stack/description/
 */
public class T155 {

    private final List<Integer> stack = new ArrayList<>();
    private final Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.add(x);
        if (minStack.isEmpty() || stack.get(minStack.peek()) > x) {
            minStack.push(stack.size() - 1);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            if (!minStack.isEmpty() && minStack.peek() == (stack.size() - 1)) {
                minStack.pop();
            }
            stack.remove(stack.size() - 1);
        }

    }

    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return stack.get(minStack.peek());
    }

}
