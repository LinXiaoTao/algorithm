package com.leo.guide.part3;

import org.junit.Assert;
import org.junit.Test;

public class GenerateTreeTest {

    @Test
    public void generateTree() {

        Node node = GenerateTree.generateTree(new int[]{-10, -3, 0, 5, 9});
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