package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T102Test {

    @Test
    public void levelOrder() {

        T102 t102 = new T102();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(
                Arrays.asList(
                        Arrays.asList(3),
                        Arrays.asList(9, 20),
                        Arrays.asList(15, 7)
                ),
                t102.levelOrder(root)
        );

    }

    @Test
    public void levelOrder1() {

        T102 t102 = new T102();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(
                Arrays.asList(
                        Arrays.asList(3),
                        Arrays.asList(9, 20),
                        Arrays.asList(15, 7)
                ),
                t102.levelOrder1(root)
        );

    }
}