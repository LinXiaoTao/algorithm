package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetMaxTreeTest {

    @Test
    public void testGetMaxTree() {

        int[] arr = new int[]{3, 4, 5, 1, 2};
        GetMaxTree.Node head = GetMaxTree.getMaxTree(arr);

        Assert.assertNotNull(head);

        Assert.assertEquals(head.value, 5);
        Assert.assertEquals(head.left.value, 4);
        Assert.assertEquals(head.right.value, 2);
        Assert.assertEquals(head.left.left.value, 3);
        Assert.assertEquals(head.right.left.value, 1);
    }
}