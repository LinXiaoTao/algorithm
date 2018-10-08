package com.leo.leetcode.stack;

import com.leo.leetcode.builtin.TreeNode;

import java.util.*;

/**
 * 144. 二叉树的前序遍历
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/description/
 */
public class T144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode, Boolean> map = new HashMap<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode mid = stack.peek();
            if (!map.containsKey(mid)) {
                result.add(mid.val);
            }
            map.put(mid, Boolean.TRUE);
            if (mid.left != null && !map.containsKey(mid.left)) {
                stack.push(mid.left);
            } else if (mid.right != null && !map.containsKey(mid.right)) {
                stack.push(mid.right);
            } else {
                stack.pop();
            }
        }
        return result;
    }

}
