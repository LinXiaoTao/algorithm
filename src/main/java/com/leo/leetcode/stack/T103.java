package com.leo.leetcode.stack;

import com.leo.leetcode.builtin.TreeNode;

import java.util.*;

/**
 * 103. 二叉树的锯齿形层次遍历
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/description/
 */
public class T103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        //     3
        //   / \
        //  9  20
        //    /  \
        //   15   7
        // [
        //  [3],
        //  [20,9],
        //  [15,7]
        //]
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        int index = 0;
        if (root != null) {
            stack.push(root);
            index++;
        }
        while (!stack.isEmpty()) {
            int size = stack.size();
            List<Integer> list = new ArrayList<>();
            Deque<TreeNode> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode parent = stack.pop();
                list.add(parent.val);
                if (index % 2 == 1) {
                    if (parent.left != null) {
                        temp.addLast(parent.left);
                    }
                    if (parent.right != null) {
                        temp.addLast(parent.right);
                    }
                } else {
                    if (parent.right != null) {
                        temp.addLast(parent.right);
                    }
                    if (parent.left != null) {
                        temp.addLast(parent.left);
                    }


                }
            }
            result.add(list);
            index++;
            while (!temp.isEmpty()){
                stack.push(temp.pollFirst());
            }
        }
        return result;
    }
}
