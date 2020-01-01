package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */
public class T106 {

    private Map<Integer, Integer> map = new HashMap<>();
    private int[] inorder;
    private int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        map.clear();
        this.inorder = inorder;
        this.postorder = postorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTree(0, inorder.length - 1, postorder.length - 1);
    }

    private TreeNode buildTree(int inStart, int inEnd, int postIndex) {
        if (inStart > inEnd) {
            return null;
        }
        int value = postorder[postIndex];
        TreeNode root = new TreeNode(value);
        int rootIndex = map.get(value);
        root.left = buildTree(inStart, rootIndex - 1, postIndex - (inEnd - rootIndex) - 1);
        root.right = buildTree(rootIndex + 1, inEnd, postIndex - 1);
        return root;
    }

}
