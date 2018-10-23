package com.leo.leetcode.dft;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class T104Test {

    @Test
    public void maxDepth() {
        T104 t104 = new T104();
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        Assert.assertEquals(
                3,
                t104.maxDepth(treeNode)
        );
    }
}