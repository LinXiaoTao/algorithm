package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
 */
public class T589 {

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preVisit(root, result);
        return result;
    }

    private void preVisit(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                preVisit(child, result);
            }
        }
    }


}
