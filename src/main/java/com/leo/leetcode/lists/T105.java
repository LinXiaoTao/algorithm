package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class T105 {

    private int index = 0;


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0) return null;
        if (preorder.length != inorder.length) return null;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTree(map, preorder, 0, preorder.length - 1);
    }

    private TreeNode buildTree(Map<Integer, Integer> map, int[] preorder, int start, int end) {

        if (index >= preorder.length) {
            return null;
        }

        if (start > end) {
            return null;
        }

        int value = preorder[index++];
        int midIndex = map.get(value);
        TreeNode root = new TreeNode(value);
        root.left = buildTree(map, preorder, start, midIndex - 1);
        root.right = buildTree(map, preorder, midIndex + 1, end);
        return root;

    }
}
