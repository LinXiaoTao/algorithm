package com.leo.linkedlist;

/**
 * 链表反转
 * Created on 2018/3/24 下午4:43
 * leo linxiaotao1993@vip.qq.com
 */
class LinkListReversed {


    static Node first(Node head) {

        // 第一种方式：使用 p 和 q 两个指针配合工作，r  记录剩下的链接
        if (head == null || head.next == null) {
            return head;
        }

        // 初始化，断开 head 节点
        Node p = head;
        Node q = head.next;
        head.next = null;

        while (q != null) {
            Node r = q.next;
            q.next = p;
            p = q;
            q = r;
        }

        return p;

    }

    static class Node {

        final int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            return value == node.value;
        }

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

}