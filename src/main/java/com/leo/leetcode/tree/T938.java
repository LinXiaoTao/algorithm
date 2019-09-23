package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 938. 二叉搜索树的范围和
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 */
public class T938 {


    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) return 0;

        if (root.val >= L && root.val <= R) {
            return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + root.val;
        } else {
            return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }


    }

}
