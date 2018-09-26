package com.leo.leetcode.ohter;

import com.leo.leetcode.ohter.T313;
import org.junit.Assert;
import org.junit.Test;

public class T313Test {

    @Test
    public void nthSuperUglyNumber() {

        T313 t313 = new T313();

        int[] primes = {2, 7, 13, 19};

        Assert.assertEquals(32, t313.nthSuperUglyNumber(12, primes));

    }
}