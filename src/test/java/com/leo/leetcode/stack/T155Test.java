package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class T155Test {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void test() {
        T155 t155 = new T155();
        t155.push(-2);
        t155.push(0);
        t155.push(-3);
        Assert.assertEquals(
                -3,
                t155.getMin()
        );
        t155.pop();
        t155.top();
        Assert.assertEquals(
                -2,
                t155.getMin()
        );
        t155.pop();
        t155.pop();
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("stack is empty");
        t155.getMin();
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("stack is empty");
        t155.top();
    }
}