package com.leo.leetcode.stack;

import com.leo.leetcode.builtin.ListNode;

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

    public boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 反转
        ListNode next = slow.next.next;
        ListNode pre = slow.next;
        slow.next = null;
        pre.next = null;
        while (next != null) {
            ListNode temp = next.next;
            next.next = pre;
            pre = next;
            next = temp;
        }

        // 比较
        while (head != null && pre != null) {
            if (head.val != pre.val) return false;
            head = head.next;
            pre = pre.next;
        }

        return true;
    }


}
