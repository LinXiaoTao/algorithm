package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.TreeNode;

import java.util.*;

/**
 * 102. 二叉树的层次遍历
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class T102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, result);
        return result;
    }

    private void levelOrder(TreeNode node, List<List<Integer>> result) {

        Queue<TreeNode> stack = new ArrayDeque<>();
        stack.offer(node);
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int cur = 0;
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.poll();
            list.add(treeNode.val);
            cur++;
            if (treeNode.left != null) {
                stack.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                stack.offer(treeNode.right);
            }
            if (cur == count) {
                result.add(list);
                list = new ArrayList<>();
                cur = 0;
                count = stack.size();
            }
        }

    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> resArray = new ArrayList<>();
        handleLevelOrder(root, resArray, 0);
        return resArray;
    }

    private void handleLevelOrder(TreeNode root, List<List<Integer>> resArray, int depth) {
        if (root == null) return;
        if (depth >= resArray.size())
            resArray.add(new ArrayList<Integer>());

        resArray.get(depth).add(root.val);

        if (root.left != null)
            handleLevelOrder(root.left, resArray, depth + 1);

        if (root.right != null)
            handleLevelOrder(root.right, resArray, depth + 1);
    }

}
