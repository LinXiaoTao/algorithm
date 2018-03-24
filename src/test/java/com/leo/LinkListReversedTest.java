package com.leo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 2018/3/24 下午4:50
 * leo linxiaotao1993@vip.qq.com
 */
public class LinkListReversedTest {

    @Test
    public void testFirst() {

        LinkListReversed.Node head = new LinkListReversed.Node(10);
        LinkListReversed.Node result = LinkListReversed.first(head);
        Assert.assertEquals(result, head);

        head = new LinkListReversed.Node(0);

        LinkListReversed.Node first = head;


        for (int i = 0; i < 10; i++) {
            first.next = new LinkListReversed.Node(i + 1);
            first = first.next;
        }

        LinkListReversed.Node tail = first;

        System.out.println("init data: " + printLog(head));

        head = LinkListReversed.first(head);

        // 新的 head 节点是否为旧的 tail 节点
        Assert.assertEquals(head, tail);

        System.out.println("reversed: " + printLog(head));

    }

    private static String printLog(LinkListReversed.Node node) {
        StringBuilder stringBuilder = new StringBuilder();
        LinkListReversed.Node first = node;
        while (first != null) {
            stringBuilder.append(first).append(",");
            first = first.next;
        }
        return stringBuilder.toString();
    }

}