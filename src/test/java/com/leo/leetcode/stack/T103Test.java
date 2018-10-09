package com.leo.leetcode.stack;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T103Test {

    @Test
    public void zigzagLevelOrder() {
        T103 t103 = new T103();
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);
        Assert.assertEquals(
                Arrays.asList(Arrays.asList(3), Arrays.asList(20, 9), Arrays.asList(15, 7)),
                t103.zigzagLevelOrder(head)
        );
    }

    @Test
    public void zigzagLevelOrder2() {
        T103 t103 = new T103();
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.right.right = new TreeNode(5);
        Assert.assertEquals(
                Arrays.asList(Arrays.asList(1), Arrays.asList(3, 2), Arrays.asList(4, 5)),
                t103.zigzagLevelOrder(head)
        );
    }
}