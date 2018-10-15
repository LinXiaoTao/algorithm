package com.leo.structure.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BinarySearchTreeTest {

    @Test
    public void test() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        Assert.assertTrue(
                tree.insert(1)
        );
        Assert.assertTrue(
                tree.insert(5)
        );
        Assert.assertTrue(
                tree.insert(4)
        );
        Assert.assertTrue(
                tree.insert(3)
        );
        Assert.assertTrue(
                tree.insert(2)
        );
        Assert.assertFalse(
                tree.insert(2)
        );
        Assert.assertTrue(
                tree.insert(6)
        );
        Assert.assertEquals(
                Arrays.asList(1, 5, 4, 3, 2, 6),
                tree.preOrderVisit()
        );
        Assert.assertEquals(
                Arrays.asList(1, 2, 3, 4, 5, 6),
                tree.mediumOrderVisit()
        );
        Assert.assertEquals(
                Arrays.asList(2, 3, 4, 6, 5, 1),
                tree.postOrderVisit()
        );
        Assert.assertEquals(
                Integer.valueOf(3),
                tree.remove(3).value
        );
        Assert.assertEquals(
                Arrays.asList(1, 2, 4, 5, 6),
                tree.mediumOrderVisit()
        );
        Assert.assertNull(
                tree.remove(3)
        );
    }

}