package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T993Test {

    @Test
    public void isCousins() {
        T993 t993 = new T993();

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(3);

        Assert.assertFalse(
                t993.isCousins(node, 4, 3)
        );


        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(5);

        Assert.assertTrue(
                t993.isCousins(node, 5, 4)
        );

        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(3);

        Assert.assertFalse(
                t993.isCousins(node, 4, 3)
        );

        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(3);

        Assert.assertFalse(
                t993.isCousins(node, 2, 3)
        );
    }
}