package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class T646Test {

    @Test
    public void findLongestChain() {
        T646 t646 = new T646();
        Assert.assertEquals(
                2,
                t646.findLongestChain(new int[][]{
                        {1, 2}, {3, 4}, {2, 3}
                })
        );
    }

    @Test
    public void findLongestChain1() {
        T646 t646 = new T646();
        Assert.assertEquals(
                2,
                t646.findLongestChain1(new int[][]{
                        {1, 2}, {3, 4}, {2, 3}
                })
        );
    }

    @Test
    public void findLongestChain2() {
        T646 t646 = new T646();
        Assert.assertEquals(
                2,
                t646.findLongestChain2(new int[][]{
                        {1, 2}, {3, 4}, {2, 3}
                })
        );
    }
}