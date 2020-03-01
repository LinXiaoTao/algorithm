package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T237Test {

    @Test
    public void deleteNode() {
        T237 t237 = new T237();
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);
        t237.deleteNode(node.next);
        Assert.assertEquals(node.val, 4);
        Assert.assertEquals(node.next.val, 1);
        Assert.assertEquals(node.next.next.val, 9);
        Assert.assertNull(node.next.next.next);
    }

    @Test
    public void deleteNode1() {
        T237 t237 = new T237();
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);
        t237.deleteNode1(node.next);
        Assert.assertEquals(node.val, 4);
        Assert.assertEquals(node.next.val, 1);
        Assert.assertEquals(node.next.next.val, 9);
        Assert.assertNull(node.next.next.next);
    }
}