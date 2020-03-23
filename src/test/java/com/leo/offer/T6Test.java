package com.leo.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T6Test {

    @Test
    public void reversePrint() {
        T6 t6 = new T6();
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(2);
        Assert.assertArrayEquals(
                new int[]{2, 3, 1},
                t6.reversePrint(node)
        );
    }
}