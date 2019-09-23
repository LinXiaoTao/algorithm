package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T938Test {

    @Test
    public void rangeSumBST() {
        T938 t938 = new T938();

        // 10,5,15,3,7,null,18
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        Assert.assertEquals(
                32,
                t938.rangeSumBST(root, 7, 15)
        );

         root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.left.left.left = new TreeNode(1);
        root.left.right.left = new TreeNode(6);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        Assert.assertEquals(
                23,
                t938.rangeSumBST(root, 6, 10)
        );
    }
}