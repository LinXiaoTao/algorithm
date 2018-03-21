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

        Assert.assertEquals(Arrays.equals(source, result), true);

    }

}