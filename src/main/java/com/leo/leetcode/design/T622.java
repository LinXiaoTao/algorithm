package com.leo.leetcode.design;

/**
 * 622. 设计循环队列
 * https://leetcode-cn.com/problems/design-circular-queue/description/
 */
public class T622 {

    private final int[] data;
    private int head;
    private int foot;
    private int size;

    public T622(int k) {
        data = new int[k];
        head = k - 1;
        foot = 0;
        size = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        data[nextHead()] = value;
        size++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        nextFoot();
        size--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[foot];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[head];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return size == data.length;
    }

    private int nextHead() {
        if (head == data.length - 1) {
            head = 0;
        } else {
            head++;
        }
        return head;
    }

    private void nextFoot() {
        if (foot == data.length - 1) {
            foot = 0;
        } else {
            foot++;
        }
    }

}
