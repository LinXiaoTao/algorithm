package com.leo.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T387Test {

    @Test
    public void firstUniqChar() {
        T387 t387 = new T387();
        Assert.assertEquals(
                0,
                t387.firstUniqChar("leetcode")
        );

        Assert.assertEquals(
                2,
                t387.firstUniqChar("loveleetcode")
        );


    }
}