package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 513. 找树左下角的值
 * https://leetcode-cn.com/problems/find-bottom-left-tree-value/
 */
public class T513 {

    public int findBottomLeftValue(TreeNode root) {

        if (root == null) return -1;

        if (root.left == null && root.right == null) {
            return root.val;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int result = root.val;

        while (!queue.isEmpty()) {

            int count = queue.size();


            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();

                if (i == 0) {
                    result = node.val;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }


        }


        return result;
    }

}
