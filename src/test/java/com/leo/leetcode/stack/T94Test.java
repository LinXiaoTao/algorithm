package com.leo.leetcode.stack;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class T94Test {

    @Test
    public void inorderTraversal() {

        T94 t94 = new T94();
        TreeNode head = new TreeNode(1);
        head.right = new TreeNode(2);
        head.right.left = new TreeNode(3);
        List<Integer> result = t94.inorderTraversal(head);
        Assert.assertEquals(
                result,
                Arrays.asList(1, 3, 2)
        );

    }

    @Test
    public void inorderTraversal1() {

        T94 t94 = new T94();
        TreeNode head = new TreeNode(2);
        head.left = new TreeNode(7);
        head.right = new TreeNode(5);
        head.right.right = new TreeNode(9);
        head.right.right.left = new TreeNode(4);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(6);
        head.left.right.left = new TreeNode(5);
        head.left.right.right = new TreeNode(11);
        List<Integer> result = t94.inorderTraversal(head);
        Assert.assertEquals(
                result,
                Arrays.asList(2, 7, 5, 6, 11, 2, 5, 4, 9)
        );

    }
}