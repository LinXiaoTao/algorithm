package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.TreeNode;
import com.leo.leetcode.tree.T108;
import org.junit.Assert;
import org.junit.Test;

public class T108Test {

    @Test
    public void sortedArrayToBST() {
        T108 t108 = new T108();
        TreeNode node = t108.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        Assert.assertEquals(
                0,
                node.val
        );
        Assert.assertEquals(
                -10,
                node.left.val
        );
        Assert.assertEquals(
                5,
                node.right.val
        );
        Assert.assertEquals(
                -3,
                node.left.right.val
        );
        Assert.assertNull(
                node.left.left
        );
        Assert.assertEquals(
                9,
                node.right.right.val
        );
        Assert.assertNull(
                node.right.left
        );
    }
}