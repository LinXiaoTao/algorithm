package com.leo.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created on 2018/3/7 下午12:05.
 * leo linxiaotao1993@vip.qq.com
 */
public class QuickSortTest {

    @Test
    public void testQuickSort() {

        final int[] source = {5, 3, 8, 6, 4};

        QuickSort.sort(source);

        System.out.println("sort result: " + Arrays.toString(source));

        final int[] result = {3, 4, 5, 6, 8};

        Assert.assertTrue(Arrays.equals(source, result));

    }

    @Test
    public void testQuickSort1() {

        final int[] source = {5, 3, 8, 3, 1, 6, 4, 2, 7};

        QuickSort.sort(source);

        System.out.println("sort result: " + Arrays.toString(source));

        final int[] result = {1, 2, 3, 3, 4, 5, 6, 7, 8};

        Assert.assertTrue(Arrays.equals(source, result));

    }

}