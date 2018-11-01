package com.leo.leetcode.tree;

import com.leo.leetcode.builtin.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class T590Test {

    @Test
    public void postorder() {


        T590 t590 = new T590();

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
                Arrays.asList(5, 6, 3, 2, 4, 1),
                t590.postorder(root)
        );

    }
}