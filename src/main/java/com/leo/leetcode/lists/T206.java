package com.leo.leetcode.lists;


import com.leo.guide.part2.Node;

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

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}