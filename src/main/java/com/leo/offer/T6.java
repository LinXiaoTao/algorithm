package com.leo.offer;

import java.util.Stack;

/**
 * 面试题06. 从尾到头打印链表
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class T6 {

    public int[] reversePrint(ListNode head) {
        if (head == null) return new int[0];
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
            count++;
        }
        int[] result = new int[count];
        count = 0;
        while (!stack.isEmpty()) {
            result[count++] = stack.pop();
        }
        return result;
    }
}
