package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

import java.util.*;

/**
 * 107. 二叉树的层次遍历 II
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/description/
 */
public class T107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        int size = 1;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            if (size == 0) {
                result.add(list);
                size = queue.size();
                list = new ArrayList<>();
            }
            TreeNode node = queue.poll();
            list.add(node.val);
            size--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

        }
        result.add(list);
        Collections.reverse(result);
        return result;
    }


}
