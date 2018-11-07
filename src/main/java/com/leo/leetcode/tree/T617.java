package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 617. 合并二叉树
 * https://leetcode-cn.com/problems/merge-two-binary-trees/description/
 */
public class T617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == null ? t2 : t1;
        }

        return merge(t1, t2);
    }

    private TreeNode merge(TreeNode t1, TreeNode t2) {
        TreeNode root = new TreeNode(t1.val + t2.val);
        merge(root, t1.left, t2.left, true);
        merge(root, t1.right, t2.right, false);
        return root;
    }

    private void merge(TreeNode root, TreeNode t1, TreeNode t2, boolean left) {
        if (t1 == null && t2 == null) {
            return;
        }
        int v1 = 0;
        int v2 = 0;

        TreeNode left1 = null;
        TreeNode right1 = null;
        TreeNode left2 = null;
        TreeNode right2 = null;

        if (t1 != null) {
            v1 = t1.val;
            left1 = t1.left;
            right1 = t1.right;
        }

        if (t2 != null) {
            v2 = t2.val;
            left2 = t2.left;
            right2 = t2.right;
        }

        if (left) {
            root.left = new TreeNode(v1 + v2);
            merge(root.left, left1, left2, true);
            merge(root.left, right1, right2, false);
        } else {
            root.right = new TreeNode(v1 + v2);
            merge(root.right, left1, left2, true);
            merge(root.right, right1, right2, false);
        }

    }

}
