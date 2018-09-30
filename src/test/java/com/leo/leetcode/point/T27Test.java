package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T27Test {

    @Test
    public void removeElement() {
        T27 t27 = new T27();
        int[] nums = new int[]{3, 2, 2, 3};
        int size = t27.removeElement(nums, 3);
        Assert.assertEquals(2, size);
        Assert.assertArrayEquals(new int[]{2, 2}, new int[]{nums[0], nums[1]});
    }

    @Test
    public void removeElement1() {
        T27 t27 = new T27();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int size = t27.removeElement(nums, 2);
        Assert.assertEquals(5, size);
        Assert.assertArrayEquals(new int[]{0, 1, 3, 0, 4}, new int[]{nums[0], nums[1], nums[2], nums[3], nums[4]});
    }

    @Test
    public void removeElement2() {
        T27 t27 = new T27();
        int[] nums = new int[]{1};
        int size = t27.removeElement(nums, 1);
        Assert.assertEquals(0, size);
    }

    @Test
    public void removeElement3() {
        T27 t27 = new T27();
        int[] nums = new int[]{2};
        int size = t27.removeElement(nums, 3);
        Assert.assertEquals(1, size);
    }
}