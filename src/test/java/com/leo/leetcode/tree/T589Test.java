package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class T589Test {

    @Test
    public void preorder() {

        T589 t589 = new T589();

        Node root = new Node();
        root.val = 1;
        List<Node> child = new ArrayList<>(3);
        root.children = child;
        child.add(new Node());
        child.get(0).val = 3;
        child.get(0).children = Arrays.asList(
                new Node(5, Collections.emptyList()),
                new Node(6, Collections.emptyList())
        );
        child.add(new Node(2, Collections.emptyList()));
        child.add(new Node(4, Collections.emptyList()));

        Assert.assertEquals(
                Arrays.asList(1, 3, 5, 6, 2, 4),
                t589.preorder(root)
        );
    }
}