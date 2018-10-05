package com.leo.guide.part2;

import org.junit.Assert;
import org.junit.Test;

public class RemoveNodeTest {

    @Test
    public void removeMidNode() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head = RemoveNode.removeMidNode(head);
        Assert.assertEquals(
                1,
                head.value
        );
        Assert.assertEquals(
                3,
                head.next.value
        );
        head = new Node(1);
        head.next = new Node(2);
        head = RemoveNode.removeMidNode(head);
        Assert.assertEquals(
                2,
                head.value
        );
    }

    @Test
    public void removeByRatio() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head = RemoveNode.removeByRatio(head, 5, 7);
        Assert.assertEquals(
                1,
                head.value
        );
        Assert.assertEquals(
                2,
                head.next.value
        );
        Assert.assertEquals(
                3,
                head.next.next.value
        );
        Assert.assertEquals(
                4,
                head.next.next.next.value
        );
        Assert.assertEquals(
                6,
                head.next.next.next.next.value
        );
        Assert.assertEquals(
                7,
                head.next.next.next.next.next.value
        );
    }
}