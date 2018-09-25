package com.leo.leetcode.design;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/implement-stack-using-queues/description/
 */
public class T225 {

    private final Queue<Integer> deque1 = new ArrayDeque<>();
    private final Queue<Integer> deque2 = new ArrayDeque<>();

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (!deque2.isEmpty()) {
            deque2.offer(x);
        } else {
            deque1.offer(x);
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        Queue<Integer> emptyDeque = deque1.isEmpty() ? deque1 : deque2;
        Queue<Integer> dataDeque = deque1.isEmpty() ? deque2 : deque1;
        while (!dataDeque.isEmpty()) {
            int data = dataDeque.poll();
            if (dataDeque.isEmpty()) {
                return data;
            } else {
                emptyDeque.offer(data);
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
     * Get the top element.
     */
    public int top() {
        Queue<Integer> emptyDeque = deque1.isEmpty() ? deque1 : deque2;
        Queue<Integer> dataDeque = deque1.isEmpty() ? deque2 : deque1;
        while (!dataDeque.isEmpty()) {
            int data = dataDeque.poll();
            emptyDeque.offer(data);
            if (dataDeque.isEmpty()) {
                return data;
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return deque1.isEmpty() && deque2.isEmpty();
    }

}
