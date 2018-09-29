package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxRectSizeTest {

    @Test
    public void maxRectSize() {

        Assert.assertEquals(6, MaxRectSize.maxRectSize(new int[][]{{1, 0, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 0}}));

    }
}