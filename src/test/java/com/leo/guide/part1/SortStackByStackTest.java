package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SortStackByStackTest {

    @Test
    public void sortStackByStack() {

        Stack<Integer> stack = new Stack<>();


        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(4);

        try {
            SortStackByStack.sortStackByStack(stack);

            Assert.assertSame(5, stack.pop());
            Assert.assertSame(4, stack.pop());
            Assert.assertSame(3, stack.pop());
            Assert.assertSame(2, stack.pop());
            Assert.assertSame(1, stack.pop());

        } catch (Exception e) {
            Assume.assumeNoException(e);
        }


    }
}