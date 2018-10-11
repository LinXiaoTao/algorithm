package com.leo.leetcode.design;

import java.util.ArrayList;
import java.util.List;

/**
 * 641. 设计循环双端队列
 * https://leetcode-cn.com/problems/design-circular-deque/description/
 */
public class T641 {

    private final List<Integer> list;
    private int index = -1;
    private int size = 0;

    public T641(int k) {
        size = k;
        list = new ArrayList<>(k);
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (size > (index + 1)) {
            index++;
            list.add(0, value);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (size > (index + 1)) {
            index++;
            return list.add(value);
        } else {
            return false;
        }
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (index > -1) {
            list.remove(0);
            index--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (index > -1) {
            list.remove(index);
            index--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(0);
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(index);
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return index < 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return index >= (size - 1);
    }

}
