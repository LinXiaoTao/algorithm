package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 965. 单值二叉树
 * https://leetcode-cn.com/problems/univalued-binary-tree/description/
 */
public class T965 {

    public boolean isUnivalTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        return recursive(root.val, root);
    }

    private boolean recursive(int val, TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.val != val) {
            return false;
        }
        return recursive(val, node.left) && recursive(val, node.right);
    }

}
