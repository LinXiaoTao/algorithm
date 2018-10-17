package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T120Test {

    @Test
    public void minimumTotal() {
        T120 t120 = new T120();
        Assert.assertEquals(
                11,
                t120.minimumTotal(Arrays.asList(
                        Arrays.asList(2),
                        Arrays.asList(3, 4),
                        Arrays.asList(6, 5, 7),
                        Arrays.asList(4, 1, 8, 3)
                ))
        );
        Assert.assertEquals(
                -1,
                t120.minimumTotal(Arrays.asList(
                        Arrays.asList(-1),
                        Arrays.asList(2, 3),
                        Arrays.asList(1, -1, -3)
                ))
        );
    }
}