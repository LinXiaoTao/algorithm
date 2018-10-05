package com.leo.leetcode.lists;

/**
 * 92. 反转链表 II
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/description/
 */
public class T92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode preNode = dummy;
        for (int i = 0; i < (m - 1); i++) {
            preNode = preNode.next;
        }
        ListNode curNode = preNode.next;
        ListNode postNode = curNode.next;
        for (int i = 0; i < (n - m); i++) {
            curNode.next = postNode.next;
            postNode.next = preNode.next;
            preNode.next = postNode;
            postNode = curNode.next;
        }
        return dummy.next;
    }

    public ListNode reverseBetween1(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode postNode = null;
        ListNode node1 = head;
        int len = 0;
        while (node1 != null) {
            len++;
            preNode = len == (m - 1) ? node1 : preNode;
            postNode = len == (n + 1) ? node1 : postNode;
            node1 = node1.next;
        }
        node1 = preNode == null ? head : preNode.next;
        ListNode node2 = node1.next;
        node1.next = postNode;
        while (node2 != postNode) {
            ListNode temp = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = temp;
        }
        if (preNode != null) {
            preNode.next = node1;
        }
        return preNode != null ? head : node1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
