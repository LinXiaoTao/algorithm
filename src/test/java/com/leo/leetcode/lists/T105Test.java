package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T105Test {

    @Test
    public void buildTree() {

        T105 t105 = new T105();
        TreeNode header = t105.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        Assert.assertEquals(header.val, 3);
        Assert.assertEquals(header.left.val, 9);
        Assert.assertEquals(header.right.val, 20);
        Assert.assertEquals(header.right.left.val, 15);
        Assert.assertEquals(header.right.right.val, 7);

    }
}