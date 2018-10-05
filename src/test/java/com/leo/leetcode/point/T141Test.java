package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T141Test {

    @Test
    public void hasCycle() {
        T141 t141 = new T141();
        T141.ListNode head = new T141.ListNode(1);
        head.next = new T141.ListNode(2);
        head.next.next = new T141.ListNode(3);
        T141.ListNode listNode = new T141.ListNode(4);
        head.next.next.next = listNode;
        head.next.next.next.next = new T141.ListNode(5);
        head.next.next.next.next.next = new T141.ListNode(6);
        head.next.next.next.next.next.next = listNode;
        Assert.assertTrue(t141.hasCycle(head));

        head.next.next.next.next.next.next = null;
        Assert.assertFalse(t141.hasCycle(head));
    }
}