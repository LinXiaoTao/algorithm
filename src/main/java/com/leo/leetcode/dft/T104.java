package com.leo.leetcode.dft;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 104. 二叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/description/
 */
public class T104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return dft(root, 0);
    }

    private int dft(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth = Math.max(dft(node.left, depth + 1),dft(node.right,depth + 1));
        return depth;
    }

}
