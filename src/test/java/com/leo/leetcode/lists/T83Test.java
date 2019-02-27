package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T83Test {

    @Test
    public void deleteDuplicates() {
        T83 t83 = new T83();
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        ListNode result = t83.deleteDuplicates(node);
        Assert.assertEquals(
                1,
                result.val
        );
        Assert.assertEquals(
                2,
                result.next.val
        );
        Assert.assertNull(
                result.next.next
        );

        node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(3);
        result = t83.deleteDuplicates(node);
        Assert.assertEquals(
                1,
                result.val
        );
        Assert.assertEquals(
                2,
                result.next.val
        );
        Assert.assertEquals(
                3,
                result.next.next.val
        );
        Assert.assertNull(
                result.next.next.next
        );

        node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(1);
        result = t83.deleteDuplicates(node);
        Assert.assertEquals(
                1,
                result.val
        );
        Assert.assertNull(
                result.next
        );
    }

    @Test
    public void deleteDuplicates1() {
        T83 t83 = new T83();
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        ListNode result = t83.deleteDuplicates1(node);
        Assert.assertEquals(
                1,
                result.val
        );
        Assert.assertEquals(
                2,
                result.next.val
        );
        Assert.assertNull(
                result.next.next
        );

        node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(3);
        result = t83.deleteDuplicates1(node);
        Assert.assertEquals(
                1,
                result.val
        );
        Assert.assertEquals(
                2,
                result.next.val
        );
        Assert.assertEquals(
                3,
                result.next.next.val
        );
        Assert.assertNull(
                result.next.next.next
        );

        node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(1);
        result = t83.deleteDuplicates1(node);
        Assert.assertEquals(
                1,
                result.val
        );
        Assert.assertNull(
                result.next
        );
    }
}