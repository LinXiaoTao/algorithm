package com.leo.leetcode.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class T46Test {

    @Test
    public void permute() {
        T46 t46 = new T46();
        Assert.assertEquals(
                Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2), Arrays.asList(2, 1, 3)
                        , Arrays.asList(2, 3, 1), Arrays.asList(3, 2, 1), Arrays.asList(3, 1, 2)),
                t46.permute(new int[]{1, 2, 3})
        );

        List<List<Integer>> result = t46.permute(new int[]{});
        Assert.assertEquals(
                1,
                result.size()
        );
    }
}