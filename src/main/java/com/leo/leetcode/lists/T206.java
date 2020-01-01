package com.leo.leetcode.lists;


import com.leo.leetcode.builtin.ListNode;

/**
 * 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 */
public class T206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = null;
        ListNode cur;
        while (head != null) {
            cur = head;
            head = head.next;
            cur.next = next;
            next = cur;
        }
        return next;
    }

    public ListNode reverseList1(ListNode head) {
        ListNode next = head.next;
        if (next == null) return head;
        while (next.next != null) {
            next = next.next;
        }
        internelReverse(head);
        head.next = null;
        return next;
    }

    private ListNode internelReverse(ListNode head) {
        ListNode next = head.next;
        if (next != null) {
            internelReverse(next).next = head;
        }
        return head;
    }


}
