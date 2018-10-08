package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;

/**
 * 237. 删除链表中的节点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/description/
 */
public class T237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }



}
