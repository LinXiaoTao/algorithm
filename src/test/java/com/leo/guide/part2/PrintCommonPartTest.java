package com.leo.guide.part2;

import org.junit.Test;

public class PrintCommonPartTest {

    @Test
    public void printCommonPart() {

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        Node head2 = new Node(0);
        head2.next = new Node(1);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(3);
        head2.next.next.next.next = new Node(4);

        PrintCommonPart.printCommonPart(head1, head2);
    }
}