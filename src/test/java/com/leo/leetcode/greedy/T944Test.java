package com.leo.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T944Test {

    @Test
    public void minDeletionSize() {
        T944 t944 = new T944();
        Assert.assertEquals(
                1,
                t944.minDeletionSize(new String[]{"cba", "daf", "ghi"})
        );
        Assert.assertEquals(
                0,
                t944.minDeletionSize(new String[]{"a", "b"})
        );
        Assert.assertEquals(
                3,
                t944.minDeletionSize(new String[]{"zyx", "wvu", "tsr"})
        );
        Assert.assertEquals(
                2,
                t944.minDeletionSize(new String[]{"rrjk", "furt", "guzm"})
        );
    }
}