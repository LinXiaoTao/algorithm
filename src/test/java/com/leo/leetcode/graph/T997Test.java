package com.leo.leetcode.graph;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T997Test {

    @Test
    public void findJudge() {

        T997 t997 = new T997();
        Assert.assertEquals(
                3,
                t997.findJudge(3, new int[][]{
                        {1, 3},
                        {2, 3}
                })
        );

        Assert.assertEquals(
                3,
                t997.findJudge(4, new int[][]{
                        {1, 3},
                        {1, 4},
                        {2, 3},
                        {2, 4},
                        {4, 3}
                })
        );

        Assert.assertEquals(
                -1,
                t997.findJudge(3, new int[][]{
                        {1, 2},
                        {2, 3}
                })
        );

    }
}