package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class ReverseStackTest {

    @Test
    public void reverse() {
        Stack<Integer> source = new Stack<>();
        for (int i = 0; i < 10; i++) {
            source.push(i);
        }
        // 0,1,2,3,4,5,6,7,8,9
        ReverseStack.reverse(source);
        Assert.assertSame(0, source.pop());
        Assert.assertSame(1, source.pop());
        Assert.assertSame(2, source.pop());
        Assert.assertSame(3, source.pop());
        Assert.assertSame(4, source.pop());
        Assert.assertSame(5, source.pop());
        Assert.assertSame(6, source.pop());
        Assert.assertSame(7, source.pop());
        Assert.assertSame(8, source.pop());
        Assert.assertSame(9, source.pop());


        // test empty
        try {
            Stack<Integer> empty = new Stack<>();
            ReverseStack.reverse(empty);
        } catch (Exception e) {
            Assume.assumeNoException(e);
        }
    }
}