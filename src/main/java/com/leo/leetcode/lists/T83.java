package com.leo.leetcode.lists;

import com.leo.leetcode.builtin.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 83. 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class T83 {

    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Boolean> map = new HashMap<>();
        ListNode node1 = head;
        ListNode node2 = null;
        while (node1 != null) {
            if (map.containsKey(node1.val)) {
                // 已存在，删除
                node2.next = node1.next;
                node1 = node1.next;
                continue;
            } else {
                map.put(node1.val, true);
            }
            node2 = node1;
            node1 = node1.next;
        }
        return head;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.val != head.next.val) {
            head.next = deleteDuplicates1(head.next);
            return head;
        } else {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates1(head);
        }
    }

}
