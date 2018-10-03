package com.leo.leetcode.lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T21Test {

    @Test
    public void mergeTwoLists() {
        T21 t21 = new T21();
        T21.ListNode l1 = new T21.ListNode(1);
        l1.next = new T21.ListNode(2);
        l1.next.next = new T21.ListNode(4);

        T21.ListNode l2 = new T21.ListNode(1);
        l2.next = new T21.ListNode(3);
        l2.next.next = new T21.ListNode(4);

        T21.ListNode result = t21.mergeTwoLists(
                l1,
                l2
        );

        Assert.assertEquals(
                1,
                result.val
        );

        result = result.next;
        Assert.assertEquals(
                1,
                result.val
        );

        result = result.next;
        Assert.assertEquals(
                2,
                result.val
        );

        result = result.next;
        Assert.assertEquals(
                3,
                result.val
        );

        result = result.next;
        Assert.assertEquals(
                4,
                result.val
        );

        result = result.next;
        Assert.assertEquals(
                4,
                result.val
        );
    }

    @Test
    public void mergeTwoLists1() {
        T21 t21 = new T21();

        T21.ListNode l2 = new T21.ListNode(0);


        T21.ListNode result = t21.mergeTwoLists(
                null,
                l2
        );

        Assert.assertEquals(
                0,
                result.val
        );

    }
}