package com.leo.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created on 2018/3/7 下午1:13.
 * leo linxiaotao1993@vip.qq.com
 */
public class SelectSortTest {

    @Test
    public void testSelectSort(){

        final int[] source = {5, 3, 8, 6, 4};

        SelectSort.sort(source);

        System.out.println("sort result: " + Arrays.toString(source));

        final int[] result = {3, 4, 5, 6, 8};

        Assert.assertEquals(Arrays.equals(source, result), true);

    }

}