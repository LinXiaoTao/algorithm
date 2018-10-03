package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T541Test {

    @Test
    public void reverseStr() {
        T541 t541 = new T541();
        Assert.assertEquals(
                "bacdfeg",
                t541.reverseStr("abcdefg", 2)
        );
        Assert.assertEquals(
                "",
                t541.reverseStr("", 2)
        );
        Assert.assertEquals(
                "a",
                t541.reverseStr("a", 2)
        );
        Assert.assertEquals(
                "ba",
                t541.reverseStr("ab", 2)
        );
    }
}