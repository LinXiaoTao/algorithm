package com.leo.leetcode.design;

import com.leo.leetcode.design.T239;
import org.junit.Assert;
import org.junit.Test;

public class T239Test {

    @Test
    public void maxSlidingWindow() {

        T239 t239 = new T239();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        Assert.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, t239.maxSlidingWindow(nums, 3));

        Assert.assertTrue(t239.maxSlidingWindow(new int[]{}, 0).length == 0);

        Assert.assertArrayEquals(new int[]{1, -1}, t239.maxSlidingWindow(new int[]{1, -1}, 1));

    }
}