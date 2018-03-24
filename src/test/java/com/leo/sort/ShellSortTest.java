package com.leo.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created on 2018/3/24 上午11:25
 * leo linxiaotao1993@vip.qq.com
 */
public class ShellSortTest {

    @Test
    public void testShellSort(){

        final int[] source = {5, 3, 8, 6, 4};

        ShellSort.sort(source);

        System.out.println("sort result: " + Arrays.toString(source));

        final int[] result = {3, 4, 5, 6, 8};

        Assert.assertEquals(Arrays.equals(source,result),true);
    }

}