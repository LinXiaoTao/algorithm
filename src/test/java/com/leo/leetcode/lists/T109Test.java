package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;
import com.leo.leetcode.builtin.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T109Test {

    @Test
    public void sortedListToBST() {
        T109 t109 = new T109();
        ListNode listNode = new ListNode(-10);
        listNode.next = new ListNode(-3);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(5);
        listNode.next.next.next.next = new ListNode(9);
        TreeNode node = t109.sortedListToBST(listNode);
        Assert.assertEquals(
                0,
                node.val
        );
        Assert.assertEquals(
                -3,
                node.left.val
        );
        Assert.assertEquals(
                -10,
                node.left.left.val
        );
        Assert.assertNull(
                node.left.right
        );
        Assert.assertEquals(
                9,
                node.right.val
        );
        Assert.assertEquals(
                5,
                node.right.left.val
        );
        Assert.assertNull(
                node.right.right
        );
    }
}