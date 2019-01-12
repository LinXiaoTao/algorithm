package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.Node;

import java.util.*;

/**
 * 429. N叉树的层序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/description/
 */
public class T429 {

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int size = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            if (size == 0) {
                result.add(list);
                size = queue.size();
                list = new ArrayList<>();
            }
            Node node = queue.poll();
            size--;
            list.add(node.val);
            if (node.children != null) {
                for (Node child : node.children) {
                    queue.offer(child);
                }
            }
        }
        result.add(list);
        return result;
    }

}
