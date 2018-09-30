package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T26Test {

    @Test
    public void removeDuplicates() {
        T26 t26 = new T26();
        int[] arr = new int[]{1, 1, 2};
        int size = t26.removeDuplicates(arr);
        Assert.assertEquals(2, size);
        Assert.assertArrayEquals(new int[]{1, 2}, new int[]{arr[0], arr[1]});
    }

    @Test
    public void removeDuplicates1() {
        T26 t26 = new T26();
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int size = t26.removeDuplicates(arr);
        Assert.assertEquals(5, size);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, new int[]{arr[0], arr[1], arr[2], arr[3], arr[4]});
    }

    @Test
    public void removeDuplicates2() {
        T26 t26 = new T26();
        int[] arr = new int[]{0, 1, 1, 2, 2, 3, 3, 4};
        int size = t26.removeDuplicates(arr);
        Assert.assertEquals(5, size);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, new int[]{arr[0], arr[1], arr[2], arr[3], arr[4]});
    }
}