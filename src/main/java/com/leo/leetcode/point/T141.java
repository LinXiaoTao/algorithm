package com.leo.leetcode.point;

import com.leo.leetcode.builtin.ListNode;

/**
 * 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/description/
 */
public class T141 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode left = head.next;
        ListNode right = head.next.next;
        while (right != null) {
            if (right == left) {
                return true;
            }
            left = left.next;
            right = right.next == null ? null : right.next.next;
        }
        return false;

    }

    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode a = head;
        ListNode b = head;

        while (a.next != null) {
            a = a.next;

            if (b.next == null || b.next.next == null) break;
            b = b.next.next;

            if (a.val == b.val) return true;
        }

        return false;
    }


}
