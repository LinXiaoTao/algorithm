package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T522Test {

    @Test
    public void findLUSlength() {
        T522 t522 = new T522();
        Assert.assertEquals(
                3,
                t522.findLUSlength(new String[]{"aba", "cdc", "eae"})
        );
        Assert.assertEquals(
                -1,
                t522.findLUSlength(new String[]{"aaa", "aaa", "aa"})
        );
    }
}