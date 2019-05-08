package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T513Test {

    @Test
    public void findBottomLeftValue() {

        T513 t513 = new T513();

        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);

        Assert.assertEquals(
                1,
                t513.findBottomLeftValue(node)
        );

        Assert.assertEquals(
                -1,
                t513.findBottomLeftValue(null)
        );

        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(6);
        node.right.left.left = new TreeNode(7);
        Assert.assertEquals(
                7,
                t513.findBottomLeftValue(node)
        );

    }
}