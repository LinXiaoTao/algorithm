package com.leo.leetcode.point;

/**
 * 86. 分隔链表
 * https://leetcode-cn.com/problems/partition-list/description/
 */
public class T86 {


    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        leftDummy.next = head;
        ListNode left = leftDummy;
        ListNode right = rightDummy;
        ListNode next = head;
        while (next != null) {
            if (next.val < x) {
                left = left.next;
            } else {
                left.next = next.next;
                right.next = next;
                right = next;
            }
            next = next.next;
        }
        right.next = null;
        left.next = rightDummy.next;
        return leftDummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
