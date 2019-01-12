package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T429Test {

    @Test
    public void levelOrder() {
        Node node = new Node(1, new ArrayList<>(3));
        node.children.add(new Node(3, new ArrayList<>(2)));
        node.children.add(new Node(2, null));
        node.children.add(new Node(4, null));
        node.children.get(0).children.add(new Node(5, null));
        node.children.get(0).children.add(new Node(6, null));
        T429 t429 = new T429();
        List<List<Integer>> result = t429.levelOrder(node);
        Assert.assertEquals(
                3,
                result.size()
        );
        Assert.assertEquals(
                Arrays.asList(1),
                result.get(0)
        );
        Assert.assertEquals(
                Arrays.asList(3, 2, 4),
                result.get(1)
        );
        Assert.assertEquals(
                Arrays.asList(5, 6),
                result.get(2)
        );
    }
}