package com.leo.leetcode.dft;

import com.leo.leetcode.builtin.Node;

/**
 * 559. N叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/description/
 */
public class T559 {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children.isEmpty()) {
            return 1;
        }
        return dfs(root, 0);
    }

    private int dfs(Node node, int count) {

        if (node == null) {
            return count;
        }
        count += 1;

        if (!node.children.isEmpty()) {
            int temp = count;
            for (Node child : node.children) {
                count = Math.max(count, dfs(child, temp));
            }
        }
        return count;
    }


}
