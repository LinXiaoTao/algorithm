package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N叉树的后序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/description/
 */
public class T590 {

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postVisit(root, result);
        return result;
    }

    private void postVisit(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        if (node.children != null) {
            for (Node child : node.children) {
                postVisit(child, result);
            }
        }
        result.add(node.val);
    }

}
