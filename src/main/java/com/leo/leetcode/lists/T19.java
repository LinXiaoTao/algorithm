package com.leo.leetcode.lists;

/**
 * 19. 删除链表的倒数第N个节点
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/description/
 */
public class T19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        while (node != null) {
            n--;
            node = node.next;
        }
        if (n > 0) {
            return head;
        }
        if (n == 0) {
            return head.next;
        }
        node = head;
        while (node != null) {
            n++;
            if (n == 0)
                break;
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
