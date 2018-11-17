package com.leo.leetcode.ohter;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T638Test {

    @Test
    public void shoppingOffers() {
        T638 t638 = new T638();
        Assert.assertEquals(
                14,
                t638.shoppingOffers(
                        Arrays.asList(2, 5),
                        Arrays.asList(Arrays.asList(3, 0, 5), Arrays.asList(1, 2, 10)),
                        Arrays.asList(3, 2)
                )
        );
        Assert.assertEquals(
                11,
                t638.shoppingOffers(
                        Arrays.asList(2, 3, 4),
                        Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9)),
                        Arrays.asList(1, 2, 1)
                )
        );
    }
}