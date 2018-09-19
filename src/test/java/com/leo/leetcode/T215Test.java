package com.leo.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T215Test {

    @Test
    public void findKthLargest() {
        int[] arr = {3,2,1,5,6,4};
        T215 t215 = new T215();
        Assert.assertEquals(5,t215.findKthLargest(arr,2));


        int[] arr1 = {3,2,3,1,2,4,5,5,6};
        Assert.assertEquals(4,t215.findKthLargest(arr1,4));

    }
}