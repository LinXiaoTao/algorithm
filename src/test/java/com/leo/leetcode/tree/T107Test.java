package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class T107Test {

    @Test
    public void levelOrderBottom() {
        T107 t107 = new T107();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        List<List<Integer>> result = t107.levelOrderBottom(node);
        Assert.assertEquals(
                result.get(0),
                Arrays.asList(15, 7)
        );
        Assert.assertEquals(
                result.get(1),
                Arrays.asList(9, 20)
        );
        Assert.assertEquals(
                result.get(2),
                Arrays.asList(3)
        );
    }
}