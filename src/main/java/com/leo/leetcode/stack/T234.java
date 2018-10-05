package com.leo.leetcode.stack;

import java.util.Stack;

/**
 * 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/description/
 */
public class T234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        int mid = stack.size() / 2;
        while (mid-- > 0) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
