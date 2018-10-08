package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T21Test {

    @Test
    public void mergeTwoLists() {
        T21 t21 = new T21();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = t21.mergeTwoLists(
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

        ListNode l2 = new ListNode(0);


        ListNode result = t21.mergeTwoLists(
                null,
                l2
        );

        Assert.assertEquals(
                0,
                result.val
        );

    }
}