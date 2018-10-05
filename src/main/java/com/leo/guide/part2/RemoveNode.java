package com.leo.guide.part2;

/**
 * 题目：
 * 删除链表的中间节点和 a/b 处的节点
 */
public class RemoveNode {

    // 删除中间的节点
    public static Node removeMidNode(Node head) {
        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    public static Node removeByRatio(Node head, int a, int b) {
        if (a < 1 || a > b) {
            return head;
        }
        int n = 0;
        Node cur = head;
        while (cur != null) {
            n++;
            cur = cur.next;
        }
        // 删除第几个节点
        n = (int) (Math.ceil((double) (a * n)) / (double) b);
        if (n == 1) {
            head = head.next;
        } else if (n > 1) {
            cur = head;
            while (--n != 1) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

}
