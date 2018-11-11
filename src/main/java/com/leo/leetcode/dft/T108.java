package com.leo.leetcode.dft;

import com.leo.leetcode.builtin.TreeNode;

/**
 * 108. 将有序数组转换为二叉搜索树
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/description/
 */
public class T108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int mid;
        TreeNode root = new TreeNode(nums[mid = nums.length / 2]);
        root.left = sortedArrayToBST(nums, 0, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, nums.length - 1);
        return root;

    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, left, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, right);
        return node;
    }

}
