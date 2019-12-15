package com.leo.leetcode.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T140Test {

    @Test
    public void wordBreak() {

        T140 t140 = new T140();
        Assert.assertEquals(
                Arrays.asList(

                        "cat sand dog",
                        "cats and dog"
                ),
                t140.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"))
        );

        Assert.assertEquals(
                Arrays.asList(
                        "pine apple pen apple",
                        "pine applepen apple",
                        "pineapple pen apple"
                ),
                t140.wordBreak("pineapplepenapple", Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"))
        );

    }
}