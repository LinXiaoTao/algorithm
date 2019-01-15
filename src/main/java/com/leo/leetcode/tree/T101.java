package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 101. 对称二叉树
 * https://leetcode-cn.com/problems/symmetric-tree/description/
 */
public class T101 {


    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root.left);
        deque.addLast(root.right);
        while (!deque.isEmpty()) {
            TreeNode first = deque.pollFirst();
            TreeNode last = deque.pollLast();
            if (first == null && last == null) continue;
            if (first == null || last == null) return false;
            if (first.val != last.val) return false;
            deque.addFirst(first.right);
            deque.addFirst(first.left);
            deque.addLast(last.left);
            deque.addLast(last.right);
        }
        return true;
    }


}
