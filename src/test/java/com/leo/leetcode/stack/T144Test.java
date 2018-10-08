package com.leo.leetcode.stack;

import com.leo.leetcode.builtin.TreeNode;
import com.leo.leetcode.point.T141;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class T144Test {

    @Test
    public void preorderTraversal() {
        T144 t144 = new T144();
        TreeNode head = new TreeNode(2);
        head.left = new TreeNode(7);
        head.right = new TreeNode(5);
        head.right.right = new TreeNode(9);
        head.right.right.left = new TreeNode(4);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(6);
        head.left.right.left = new TreeNode(5);
        head.left.right.right = new TreeNode(11);
        List<Integer> result = t144.preorderTraversal(head);
        Assert.assertEquals(
                result,
                Arrays.asList(2,7,2,6,5,11,5,9,4)
        );
    }
}