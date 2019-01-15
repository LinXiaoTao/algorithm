package com.leo.leetcode.binary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T704Test {

    @Test
    public void search() {
        T704 t704 = new T704();
        Assert.assertEquals(
                4,
                t704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)
        );
        Assert.assertEquals(
                -1,
                t704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)
        );
    }
}