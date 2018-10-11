package com.leo.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T205Test {

    @Test
    public void isIsomorphic() {
        T205 t205 = new T205();
        Assert.assertTrue(
                t205.isIsomorphic("egg", "add")
        );
        Assert.assertFalse(
                t205.isIsomorphic("foo", "bar")
        );
        Assert.assertTrue(
                t205.isIsomorphic("paper", "title")
        );
        Assert.assertFalse(
                t205.isIsomorphic("ab", "aa")
        );


        Assert.assertTrue(
                t205.isIsomorphic1("egg", "add")
        );
        Assert.assertFalse(
                t205.isIsomorphic1("foo", "bar")
        );
        Assert.assertTrue(
                t205.isIsomorphic1("paper", "title")
        );
        Assert.assertFalse(
                t205.isIsomorphic1("ab", "aa")
        );
    }
}