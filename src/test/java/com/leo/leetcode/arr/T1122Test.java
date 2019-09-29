package com.leo.leetcode.arr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T1122Test {

    @Test
    public void relativeSortArray() {


        T1122 t1122 = new T1122();

        Assert.assertArrayEquals(
                new int[]{
                        2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19
                },
                t1122.relativeSortArray(new int[]{
                        2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19
                }, new int[]{
                        2, 1, 4, 3, 9, 6
                })
        );

        Assert.assertArrayEquals(
                new int[]{
                        21, 11, 26, 20, 1, 18, 34, 50
                },
                t1122.relativeSortArray(new int[]{
                        26, 21, 11, 20, 50, 34, 1, 18
                }, new int[]{
                        21, 11, 26, 20
                })
        );


    }

    @Test
    public void relativeSortArray1() {


        T1122 t1122 = new T1122();

        Assert.assertArrayEquals(
                new int[]{
                        2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19
                },
                t1122.relativeSortArray1(new int[]{
                        2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19
                }, new int[]{
                        2, 1, 4, 3, 9, 6
                })
        );

        Assert.assertArrayEquals(
                new int[]{
                        21, 11, 26, 20, 1, 18, 34, 50
                },
                t1122.relativeSortArray1(new int[]{
                        26, 21, 11, 20, 50, 34, 1, 18
                }, new int[]{
                        21, 11, 26, 20
                })
        );


    }
}