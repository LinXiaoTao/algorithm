package com.leo.leetcode.stack;

import com.leo.leetcode.builtin.TreeNode;

import java.util.*;

/**
 * 94. 二叉树的中序遍历
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 */
public class T94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode, Boolean> map = new HashMap<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode mid = stack.peek();
            if (mid.left != null && !map.containsKey(mid.left)) {
                // 遍历左节点
                stack.push(mid.left);
            } else {
                // 没有左节点，访问中值
                result.add(mid.val);
                map.put(mid, Boolean.TRUE);
                stack.pop();
                // 遍历右节点
                if (mid.right != null && !map.containsKey(mid.right)) {
                    stack.push(mid.right);
                }
            }
        }
        return result;
    }

}
