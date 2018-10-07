package com.leo.leetcode.lists;

/**
 * 203. 删除链表中的节点
 * https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 */
public class T203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode next = node.next;
        ListNode pre = node;
        while (next != null) {
            if (next.val == val) {
                pre.next = next.next;
                next = next.next;
                continue;
            }
            pre = next;
            next = next.next;
        }
        return node.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
