package com.leo.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T806Test {

    @Test
    public void numberOfLines() {
        T806 t806 = new T806();

        Assert.assertArrayEquals(
                new int[]{3, 60},
                t806.numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                        "abcdefghijklmnopqrstuvwxyz")
        );

        Assert.assertArrayEquals(
                new int[]{2, 4},
                t806.numberOfLines(new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                        "bbbcccdddaaa")
        );
    }
}