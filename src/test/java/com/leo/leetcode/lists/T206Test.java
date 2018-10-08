package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T206Test {

    @Test
    public void reverseList() {
        T206 t206 = new T206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newHead = t206.reverseList(head);
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