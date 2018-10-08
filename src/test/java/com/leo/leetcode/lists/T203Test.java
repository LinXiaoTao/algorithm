package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T203Test {

    @Test
    public void removeElements() {
        T203 t203 = new T203();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head = t203.removeElements(head, 6);
        Assert.assertEquals(
                1,
                head.val
        );
        Assert.assertEquals(
                2,
                head.next.val
        );
        Assert.assertEquals(
                3,
                head.next.next.val
        );
        Assert.assertEquals(
                4,
                head.next.next.next.val
        );
        Assert.assertEquals(
                5,
                head.next.next.next.next.val
        );
        head = new ListNode(6);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head = t203.removeElements(head, 6);
        Assert.assertEquals(
                1,
                head.val
        );
        Assert.assertEquals(
                2,
                head.next.val
        );
        Assert.assertEquals(
                3,
                head.next.next.val
        );
        Assert.assertEquals(
                4,
                head.next.next.next.val
        );
        Assert.assertEquals(
                5,
                head.next.next.next.next.val
        );
    }
}