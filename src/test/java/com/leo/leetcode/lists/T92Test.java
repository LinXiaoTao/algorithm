package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T92Test {

    @Test
    public void reverseBetween1() {

        T92 t92 = new T92();
        //1,2,3,4,5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

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