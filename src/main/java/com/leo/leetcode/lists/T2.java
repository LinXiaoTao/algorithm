package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;

/**
 * 2. 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 */
public class T2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // (2 -> 4 -> 3) + (5 -> 6 -> 4) = 7 -> 0 -> 8
        // 342 + 465 = 807
        if (l1 == null || l2 == null) {
            return l1 == null ? l1 : l2;
        }
        ListNode result = new ListNode(0);
        ListNode node = result;
        ListNode pre = null;
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (node1 != null && node2 != null) {
            int sum = 0;
            if (pre != null) {
                sum += pre.val;
                pre = null;
            }
            sum += node1.val;
            sum += node2.val;
            if (sum / 10 > 0) {
                pre = new ListNode(sum / 10);
            }
            node1 = node1.next;
            node2 = node2.next;
            if (node1 != null || node2 != null || pre != null) {
                if (node1 == null){
                    node1 = new ListNode(0);
                }
                if (node2 == null){
                    node2 = new ListNode(0);
                }
            }
            node.next = new ListNode(sum % 10);
            node = node.next;
        }
        return result.next;
    }


}
