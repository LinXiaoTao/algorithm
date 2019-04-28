package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 111. 二叉树的最小深度
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/description/
 */
public class T111 {

    public int minDepth(TreeNode root) {
        return depth(root);
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        if (node.left == null) {
            return depth(node.right) + 1;
        }
        if (node.right == null) {
            return depth(node.left) + 1;
        }
        return Math.min(depth(node.left), depth(node.right)) + 1;
    }

}
