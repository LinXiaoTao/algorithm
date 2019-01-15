package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 111. 二叉树的最小深度
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/description/
 */
public class T111 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(1, root.left);
        int right = depth(1, root.right);
        if (left == 1) return right;
        if (right == 1) return left;
        return Math.min(left, right);
    }

    private int depth(int depth, TreeNode node) {
        if (node == null) return depth;
        return Math.min(depth(depth + 1, node.left), depth(depth + 1, node.right));
    }

}
