package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T101Test {

    @Test
    public void isSymmetric() {
        T101 t101 = new T101();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);
        Assert.assertTrue(
                t101.isSymmetric(node)
        );
        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);
        Assert.assertFalse(
                t101.isSymmetric(node)
        );
        node = new TreeNode(2);
        node.left = new TreeNode(3);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(4);
        node.left.right.left = new TreeNode(8);
        node.left.right.right = new TreeNode(9);
        node.right.right.left = new TreeNode(9);
        node.right.right.left = new TreeNode(8);
        Assert.assertFalse(
                t101.isSymmetric(node)
        );
    }
}