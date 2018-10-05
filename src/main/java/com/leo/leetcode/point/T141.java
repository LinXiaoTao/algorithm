package com.leo.leetcode.point;

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

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
