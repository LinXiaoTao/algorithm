package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T965Test {

    @Test
    public void isUnivalTree() {
        T965 t965 = new T965();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(1);
        node.right = new TreeNode(1);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(1);
        node.right.right = new TreeNode(1);
        Assert.assertTrue(
                t965.isUnivalTree(node)
        );

        TreeNode node1 = new TreeNode(2);
        node1.left = new TreeNode(2);
        node1.right = new TreeNode(2);
        node1.left.left = new TreeNode(5);
        node1.left.right = new TreeNode(2);
        Assert.assertFalse(
                t965.isUnivalTree(node1)
        );
    }
}