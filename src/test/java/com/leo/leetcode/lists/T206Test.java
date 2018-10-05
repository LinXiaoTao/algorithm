package com.leo.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T206Test {

    @Test
    public void reverseList() {
        T206 t206 = new T206();
        T206.ListNode head = new T206.ListNode(1);
        head.next = new T206.ListNode(2);
        head.next.next = new T206.ListNode(3);
        head.next.next.next = new T206.ListNode(4);
        head.next.next.next.next = new T206.ListNode(5);
        T206.ListNode newHead = t206.reverseList(head);
        Assert.assertEquals(
                5, newHead.val
        );
        Assert.assertEquals(
                4, newHead.next.val
        );
        Assert.assertEquals(
                3, newHead.next.next.val
        );
        Assert.assertEquals(
                2, newHead.next.next.next.val
        );
        Assert.assertEquals(
                1, newHead.next.next.next.next.val
        );
        Assert.assertNull(
                newHead.next.next.next.next.next
        );
    }
}