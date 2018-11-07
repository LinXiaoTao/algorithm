package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class T617Test {

    @Test
    public void mergeTrees() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.left.right = new TreeNode(4);
        t2.right = new TreeNode(3);
        t2.right.right = new TreeNode(7);
        T617 t617 = new T617();
        TreeNode node = t617.mergeTrees(t1, t2);
        Assert.assertEquals(
                3,
                node.val
        );
        Assert.assertEquals(
                4,
                node.left.val
        );
        Assert.assertEquals(
                5,
                node.right.val
        );
        Assert.assertEquals(
                5,
                node.left.left.val
        );
        Assert.assertEquals(
                4,
                node.left.right.val
        );
        Assert.assertEquals(
                5,
                node.right.val
        );
        Assert.assertEquals(
                7,
                node.right.right.val
        );
    }
}