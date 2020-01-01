package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;


public class T106Test {

    @Test
    public void buildTree() {

        T106 t106 = new T106();
        TreeNode header = t106.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        Assert.assertEquals(header.val, 3);
        Assert.assertEquals(header.left.val, 9);
        Assert.assertEquals(header.right.val, 20);
        Assert.assertEquals(header.right.left.val, 15);
        Assert.assertEquals(header.right.right.val, 7);

    }
}