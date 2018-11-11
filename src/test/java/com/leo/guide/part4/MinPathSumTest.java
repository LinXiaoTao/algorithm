package com.leo.guide.part4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinPathSumTest {

    @Test
    public void minPathSum1() {
        Assert.assertEquals(
                12,
                MinPathSum.minPathSum1(
                        new int[][]{
                                {1, 3, 5, 9},
                                {8, 1, 3, 4},
                                {5, 0, 6, 1},
                                {8, 8, 4, 0}
                        }
                )
        );
    }

    @Test
    public void minPathSum2() {
        Assert.assertEquals(
                12,
                MinPathSum.minPathSum2(
                        new int[][]{
                                {1, 3, 5, 9},
                                {8, 1, 3, 4},
                                {5, 0, 6, 1},
                                {8, 8, 4, 0}
                        }
                )
        );
    }
}