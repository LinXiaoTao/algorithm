package com.leo.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T85Test {

    @Test
    public void maximalRectangle() {
        T85 t85 = new T85();
        char[][] arr = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        Assert.assertEquals(
                6,
                t85.maximalRectangle(arr)
        );
    }

    @Test
    public void maximalRectangle1() {
        T85 t85 = new T85();
        char[][] arr = new char[][]{
                {'0', '1', '1', '0', '1'},
                {'1', '1', '0', '1', '0'},
                {'0', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'},
                {'0', '0', '0', '0', '0'}
        };
        Assert.assertEquals(
                9,
                t85.maximalRectangle(arr)
        );
    }
}