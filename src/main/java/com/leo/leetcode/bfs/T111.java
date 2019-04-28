package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.TreeNode;

import java.util.*;

/**
 * 111. 二叉树的最小深度
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 */
public class T111 {


    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        // depth map
        Map<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> stack = new LinkedList<>();
        int depth = 1;
        stack.offer(root);
        map.put(root, 1);
        while (!stack.isEmpty()) {
            TreeNode node = stack.poll();
            int curDepth = map.get(node);
            if (node.left == null && node.right == null) {
                // find
                depth = curDepth;
                break;
            }

            if (node.left != null) {
                map.put(node.left, curDepth + 1);
                stack.offer(node.left);
            }

            if (node.right != null) {
                map.put(node.right, curDepth + 1);
                stack.offer(node.right);
            }

        }
        return depth;
    }

}
