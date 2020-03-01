package com.leo.leetcode.point;

import com.leo.leetcode.builtin.ListNode;
import com.leo.leetcode.stack.T234;
import org.junit.Assert;
import org.junit.Test;

public class T234Test {

    @Test
    public void isPalindrome() {
        T234 t234 = new T234();
        Assert.assertTrue(t234.isPalindrome(null));

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        Assert.assertFalse(t234.isPalindrome(node));

        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);

        Assert.assertTrue(t234.isPalindrome(node));
    }

    @Test
    public void isPalindrome1() {
        T234 t234 = new T234();
        Assert.assertTrue(t234.isPalindrome1(null));

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        Assert.assertFalse(t234.isPalindrome1(node));

        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);

        Assert.assertTrue(t234.isPalindrome1(node));
    }
}