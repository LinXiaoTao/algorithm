package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import com.leo.leetcode.builtin.TreeNode;

/**
 * 109. 有序链表转换二叉搜索树
 * https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/description/
 */
public class T109 {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        return generateTree(head, null);
    }

    private TreeNode generateTree(ListNode head, ListNode tail) {
        if (head == tail) return null;
        // 快慢指针
        ListNode slower = head;
        ListNode faster = head;
        while (faster != tail) {
            faster = faster.next;
            if (faster != tail) {
                faster = faster.next;
                slower = slower.next;
            }
        }
        // 慢指针为居中节点
        TreeNode node = new TreeNode(slower.val);
        node.left = generateTree(head, slower);
        node.right = generateTree(slower.next, tail);
        return node;
    }

}
