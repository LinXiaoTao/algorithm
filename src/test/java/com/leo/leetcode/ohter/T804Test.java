package com.leo.leetcode.ohter;

import com.leo.leetcode.other.T804;
import org.junit.Assert;
import org.junit.Test;

public class T804Test {

    @Test
    public void uniqueMorseRepresentations() {
        T804 t804 = new T804();
        Assert.assertEquals(
                2,
                t804.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"})
        );
    }
}