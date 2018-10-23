package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T226Test {

    @Test
    public void invertTree() {
        T226 t226 = new T226();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        t226.invertTree(root);
        Assert.assertEquals(
                4,
                root.val
        );
        Assert.assertEquals(
                7,
                root.left.val
        );
        Assert.assertEquals(
                2,
                root.right.val
        );
        Assert.assertEquals(
                9,
                root.left.left.val
        );
        Assert.assertEquals(
                6,
                root.left.right.val
        );
        Assert.assertEquals(
                3,
                root.right.left.val
        );
        Assert.assertEquals(
                1,
                root.right.right.val
        );
    }
}