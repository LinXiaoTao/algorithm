package com.leo.leetcode.bfs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T994Test {

    @Test
    public void orangesRotting() {

        T994 t994 = new T994();
        Assert.assertEquals(
                4,
                t994.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}})
        );

        Assert.assertEquals(
                -1,
                t994.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}})
        );

        Assert.assertEquals(
                0,
                t994.orangesRotting(new int[][]{{0, 2}})
        );

        Assert.assertEquals(
                1,
                t994.orangesRotting(new int[][]{{1, 2}})
        );

    }
}