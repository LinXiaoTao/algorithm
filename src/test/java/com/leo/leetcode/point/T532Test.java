package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T532Test {

    @Test
    public void findPairs() {
        T532 t532 = new T532();
        Assert.assertEquals(
                2,
                t532.findPairs(
                        new int[]{3, 1, 4, 1, 5},
                        2
                )
        );

        Assert.assertEquals(
                4,
                t532.findPairs(
                        new int[]{1, 2, 3, 4, 5},
                        1
                )
        );

        Assert.assertEquals(
                1,
                t532.findPairs(
                        new int[]{1, 3, 1, 5, 4},
                        0
                )
        );
    }
}