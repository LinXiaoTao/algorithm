package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class T700Test {

    @Test
    public void searchBST() {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(7);
        T700 t700 = new T700();
        TreeNode result = t700.searchBST(node, 2);
        Assert.assertEquals(
                2,
                result.val
        );
        Assert.assertEquals(
                1,
                result.left.val
        );
        Assert.assertEquals(
                3,
                result.right.val
        );
        result = t700.searchBST(node, 5);
        Assert.assertNull(
                result
        );

    }
}