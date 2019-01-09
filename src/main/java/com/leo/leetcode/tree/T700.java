package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 700. 二叉搜索树中的搜索
 * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/description/
 */
public class T700 {

    public TreeNode searchBST(TreeNode root, int val) {
        return recursion(root, val);
    }

    private TreeNode recursion(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        TreeNode left = recursion(node.left, val);
        if (left == null) {
            return recursion(node.right, val);
        }
        return left;
    }

}
