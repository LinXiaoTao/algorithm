package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T86Test {

    @Test
    public void partition() {
        T86.ListNode head = new T86.ListNode(1);
        head.next = new T86.ListNode(4);
        head.next.next = new T86.ListNode(3);
        head.next.next.next = new T86.ListNode(2);
        head.next.next.next.next = new T86.ListNode(5);
        head.next.next.next.next.next = new T86.ListNode(2);
        T86 t86 = new T86();
        head = t86.partition(head, 3);
        Assert.assertEquals(
                1,
                head.val
        );
        Assert.assertEquals(
                2,
                head.next.val

        );
        Assert.assertEquals(
                2,
                head.next.next.val
        );
        Assert.assertEquals(
                4,
                head.next.next.next.val
                );
        Assert.assertEquals(
                3,
                head.next.next.next.next.val
        );
        Assert.assertEquals(
                5,
                head.next.next.next.next.next.val
        );
    }
}