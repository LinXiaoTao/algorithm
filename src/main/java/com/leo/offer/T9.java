package com.leo.offer;

import java.util.Stack;

/**
 * 面试题09. 用两个栈实现队列
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class T9 {

    static class CQueue {

        private final Stack<Integer> stackPush = new Stack<>();
        private final Stack<Integer> stackPop = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            stackPush.push(value);
        }

        public int deleteHead() {
            if (!stackPop.isEmpty()) {
                return stackPop.pop();
            }
            if (!stackPush.isEmpty()) {
                while (!stackPush.isEmpty()) {
                    stackPop.push(stackPush.pop());
                }
                return stackPop.pop();
            }

            return -1;
        }
    }
}
