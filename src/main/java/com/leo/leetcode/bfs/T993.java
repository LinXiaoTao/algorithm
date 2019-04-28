package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 993. 二叉树的堂兄弟节点
 * https://leetcode-cn.com/problems/cousins-in-binary-tree/
 */
public class T993 {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        if (x == y) return false;

        TreeNode[] parent = new TreeNode[101];
        Queue<TreeNode> stack = new ArrayDeque<>();
        stack.offer(root);
        int count = 1;
        int cur = 0;
        int containsX = -1;
        int containsY = -1;
        parent[root.val] = null;
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.poll();
            cur++;
            if (treeNode.val == x) containsX = treeNode.val;
            if (treeNode.val == y) containsY = treeNode.val;
            if (treeNode.left != null) {
                stack.offer(treeNode.left);
                parent[treeNode.left.val] = treeNode;

            }
            if (treeNode.right != null) {
                stack.offer(treeNode.right);
                parent[treeNode.right.val] = treeNode;
            }
            if ((containsX != -1) && (containsY != -1)) return parent[containsX] != parent[containsY];
            if (cur == count) {
                if ((containsX != -1) != (containsY != -1)) return false;
                cur = 0;
                count = stack.size();
            }
        }

        return false;
    }

}
