package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;

/**
 * 21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 */
public class T21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode next = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (head == null) {
                    head = l1;
                    next = head;
                } else {
                    next.next = l1;
                    next = next.next;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    head = l2;
                    next = head;
                } else {
                    next.next = l2;
                    next = next.next;
                }
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            if (head == null) {
                head = l1;
                next = head;
            } else {
                next.next = l1;
                next = next.next;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            if (head == null) {
                head = l2;
                next = head;
            } else {
                next.next = l2;
                next = next.next;
            }
            l2 = l2.next;
        }
        return head;
    }



}
