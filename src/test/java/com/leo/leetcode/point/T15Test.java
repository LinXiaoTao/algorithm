package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class T15Test {

    @Test
    public void threeSum() {
        T15 t15 = new T15();
        List<List<Integer>> result = t15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        Assert.assertEquals(
                2,
                result.size()
        );
        Assert.assertEquals(
                Arrays.asList(-1, -1, 2),
                result.get(0)
        );
        Assert.assertEquals(
                Arrays.asList(0, -1, 1),
                result.get(1)
        );

        result = t15.threeSum(new int[]{0, 0, 0, 0});
        Assert.assertEquals(
                1,
                result.size()
        );
        result = t15.threeSum(new int[]{3, 0, -2, -1, 1, 2});
        Assert.assertEquals(
                3,
                result.size()
        );

    }
}