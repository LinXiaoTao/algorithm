package com.leo.guide.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 题目：
 * 设计一个有 GetMin 功能的栈
 * 要求：
 * 1. pop、push、getMin 操作的时间复杂度都是 O(1)
 */
public class GetMinStack<E extends Comparable<E>> {

    private final List<Integer> minStack = new ArrayList<>();
    private final List<E> dataStack = new ArrayList<>();

    public E getMin() {
        if (minStack.isEmpty() || dataStack.isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return dataStack.get(minStack.get(minStack.size() - 1));
    }

    public void push(E data) {

        dataStack.add(data);
        if (minStack.isEmpty()) {
            minStack.add(dataStack.size() - 1);
        } else if (data.compareTo(dataStack.get(minStack.get(minStack.size() - 1))) < 0) {
            // 小于
            minStack.add(dataStack.size() - 1);
        }
    }

    public E pop() {
        if (dataStack.isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        if (!minStack.isEmpty()) {
            if (minStack.get(minStack.size() - 1) == dataStack.size() - 1){
                minStack.remove(minStack.size() - 1);
            }
        }
        return dataStack.remove(dataStack.size() - 1);
    }


}
