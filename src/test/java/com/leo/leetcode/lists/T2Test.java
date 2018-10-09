package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T2Test {

    @Test
    public void addTwoNumbers() {
        T2 t2 = new T2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = t2.addTwoNumbers(l1, l2);
        Assert.assertEquals(
                7,
                result.val

        );
        Assert.assertEquals(
                0,
                result.next.val

        );
        Assert.assertEquals(
                8,
                result.next.next.val

        );
    }

    @Test
    public void addTwoNumbers1() {
        T2 t2 = new T2();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode result = t2.addTwoNumbers(l1, l2);
        Assert.assertEquals(
                0,
                result.val

        );
        Assert.assertEquals(
                1,
                result.next.val
        );
    }

    @Test
    public void addTwoNumbers2() {
        T2 t2 = new T2();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);
        ListNode result = t2.addTwoNumbers(l1, l2);
        Assert.assertEquals(
                1,
                result.val

        );
        Assert.assertEquals(
                8,
                result.next.val

        );

    }
}