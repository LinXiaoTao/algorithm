package com.leo.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T92Test {

    @Test
    public void reverseBetween1() {

        T92 t92 = new T92();
        //1,2,3,4,5
        T92.ListNode head = new T92.ListNode(1);
        head.next = new T92.ListNode(2);
        head.next.next = new T92.ListNode(3);
        head.next.next.next = new T92.ListNode(4);
        head.next.next.next.next = new T92.ListNode(5);

        head = t92.reverseBetween1(head, 2, 4);

        Assert.assertEquals(
                1,
                head.val
        );

        Assert.assertEquals(
                4,
                head.next.val
        );

        Assert.assertEquals(
                3,
                head.next.next.val
        );

        Assert.assertEquals(
                2,
                head.next.next.next.val
        );

        Assert.assertEquals(
                5,
                head.next.next.next.next.val
        );

    }
}