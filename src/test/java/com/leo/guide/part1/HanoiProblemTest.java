package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Test;

import static com.leo.guide.part1.HanoiProblem.Tower.LEFT;
import static com.leo.guide.part1.HanoiProblem.Tower.RIGHT;
import static org.junit.Assert.*;

public class HanoiProblemTest {

    @Test
    public void testRecursive() {

        int count = HanoiProblem.recursive(2, LEFT, RIGHT);
        Assert.assertSame(count, 8);

        count = HanoiProblem.recursive(2, RIGHT, LEFT);
        Assert.assertSame(count, 8);

    }

    @Test
    public void testStack() {
        int count = HanoiProblem.stack(2, LEFT, RIGHT);
        Assert.assertSame(count, 8);

        count = HanoiProblem.stack(2, RIGHT, LEFT);
        Assert.assertSame(count, 8);
    }
}