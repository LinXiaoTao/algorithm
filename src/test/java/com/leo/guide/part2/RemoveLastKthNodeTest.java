package com.leo.guide.part2;

import org.junit.Assert;
import org.junit.Test;

public class RemoveLastKthNodeTest {

    @Test
    public void removeLastKthNode() {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Assert.assertEquals(head, RemoveLastKthNode.removeLastKthNode(head, 4));

        Assert.assertNull(RemoveLastKthNode.removeLastKthNode(head, 1).next.next);
        Assert.assertEquals(head.next, RemoveLastKthNode.removeLastKthNode(head, 2));
    }

    @Test
    public void removeLastKthNode1() {

        DoubleNode head = new DoubleNode(1);
        DoubleNode next = new DoubleNode(2);
        head.next = next;
        next.pre = head;
        next.next = new DoubleNode(3);
        next.next.pre = next;

        Assert.assertEquals(head, RemoveLastKthNode.removeLastKthNode(head, 4));

        Assert.assertNull(RemoveLastKthNode.removeLastKthNode(head, 1).next.next);
        Assert.assertEquals(2, RemoveLastKthNode.removeLastKthNode(head, 2).value);
    }

    @Test
    public void removeLastKthNode2() {

        DoubleNode head = new DoubleNode(1);
        DoubleNode next = new DoubleNode(2);
        head.next = next;
        next.pre = head;
        next.next = new DoubleNode(3);
        next.next.pre = next;

        DoubleNode result = RemoveLastKthNode.removeLastKthNode(head, 2);
        Assert.assertEquals(head, result);
        Assert.assertEquals(3, result.next.value);
        Assert.assertEquals(1, result.next.pre.value);
    }
}