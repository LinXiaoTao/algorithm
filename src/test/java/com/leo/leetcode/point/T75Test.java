package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

public class T75Test {

    @Test
    public void sortColors() {
        T75 t75 = new T75();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        t75.sortColors(nums);
        Assert.assertArrayEquals(
                new int[]{0, 0, 1, 1, 2, 2},
                nums
        );
    }

    @Test
    public void sortColors1() {
        T75 t75 = new T75();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        t75.sortColors1(nums);
        Assert.assertArrayEquals(
                new int[]{0, 0, 1, 1, 2, 2},
                nums
        );
    }
}