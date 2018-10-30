package com.leo.leetcode.dft;

import com.leo.leetcode.builtin.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class T559Test {

    @Test
    public void maxDepth() {
        T559 t559 = new T559();
        Node root = new Node(1, Collections.emptyList());
        Node leftNode = new Node(3, Collections.emptyList());
        Node midNode = new Node(2, Collections.emptyList());
        Node rightNode = new Node(4, Collections.emptyList());
        root.children = (Arrays.asList(leftNode, midNode, rightNode));
        leftNode.children = Arrays.asList(new Node(5, Collections.emptyList()), new Node(6, Collections.emptyList()));
        Assert.assertEquals(
                3,
                t559.maxDepth(root)
        );
    }
}