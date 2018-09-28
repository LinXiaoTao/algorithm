package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GetMinStackTest {


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testPush() {

        Integer[] testData = {3, 4, 5, 1, 2, 1};
        GetMinStack<Integer> stack = new GetMinStack<>();

        stack.push(testData[0]);
        Assert.assertSame(testData[0], stack.getMin());

        stack.push(testData[1]);
        Assert.assertSame(testData[0], stack.getMin());

        stack.push(testData[2]);
        Assert.assertSame(testData[0], stack.getMin());

        stack.push(testData[3]);
        Assert.assertSame(testData[3], stack.getMin());

        stack.push(testData[4]);
        Assert.assertSame(testData[3], stack.getMin());

        stack.push(testData[5]);
        Assert.assertSame(testData[3], stack.getMin());
    }

    @Test
    public void testPop() {
        Integer[] testData = {3, 4, 5, 1, 2, 1};
        GetMinStack<Integer> stack = new GetMinStack<>();
        for (Integer it : testData) {
            stack.push(it);
        }
        Assert.assertSame(1, stack.getMin());

        stack.pop(); // 1
        Assert.assertSame(1, stack.getMin());

        stack.pop(); // 2
        Assert.assertSame(1, stack.getMin());

        stack.pop();// 1
        Assert.assertSame(3, stack.getMin());

        stack.pop(); // 5
        Assert.assertSame(3, stack.getMin());

        stack.pop(); // 4
        Assert.assertSame(3, stack.getMin());

        stack.pop(); // 3

        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("stack is empty");
        // exception
        stack.getMin();
    }

}