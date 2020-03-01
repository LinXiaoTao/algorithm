package com.leo.leetcode.point;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T141Test {

    @Test
    public void hasCycle() {
        T141 t141 = new T141();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode listNode = new ListNode(4);
        head.next.next.next = listNode;
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = listNode;
        Assert.assertTrue(t141.hasCycle(head));

        head.next.next.next.next.next.next = null;
        Assert.assertFalse(t141.hasCycle(head));
    }

    @Test
    public void hasCycle1() {
        T141 t141 = new T141();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode listNode = new ListNode(4);
        head.next.next.next = listNode;
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = listNode;
        Assert.assertTrue(t141.hasCycle1(head));

        head.next.next.next.next.next.next = null;
        Assert.assertFalse(t141.hasCycle1(head));
    }
}