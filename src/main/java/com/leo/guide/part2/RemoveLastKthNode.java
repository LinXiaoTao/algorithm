package com.leo.guide.part2;

/**
 * 题目：
 * 在单链表和双链表中删除倒数第 K 个节点
 */
public class RemoveLastKthNode {

    /**
     * 单链表
     */
    public static Node removeLastKthNode(Node head, int lastKth) {
        Node node = head;
        while (node != null) {
            lastKth--;
            node = node.next;
        }
        if (lastKth == 0) {
            return head.next;
        } else if (lastKth < 0) {
            node = head;
            while (++lastKth < 0) {
                node = node.next;
            }
            // 当前 node 为需要删除节点的前一个节点
            node.next = node.next.next;
        }
        return head;
    }

    /**
     * 双链表
     */
    public static DoubleNode removeLastKthNode(DoubleNode head, int lastKth) {
        DoubleNode node = head;
        while (node != null) {
            lastKth--;
            node = node.next;
        }
        if (lastKth == 0) {
            head.next.pre = null;
            return head.next;
        } else if (lastKth < 0) {
            node = head;
            while (++lastKth < 0) {
                node = node.next;
            }
            // 当前 node 为需要删除节点的前一个节点
            node.next = node.next.next;
            if (node.next != null) {
                node.next.pre = node;
            }
        }
        return head;
    }

}
