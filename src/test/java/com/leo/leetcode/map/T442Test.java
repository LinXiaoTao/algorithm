package com.leo.leetcode.map;

import com.leo.leetcode.map.T442;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class T442Test {

    @Test
    public void findDuplicates() {

        T442 t442 = new T442();
        Assert.assertEquals(
                Arrays.asList(2, 3),
                t442.findDuplicates1(new int[]{4, 3, 2, 7, 8, 2, 3, 1})
        );

    }
}