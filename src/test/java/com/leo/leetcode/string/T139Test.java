package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T139Test {

    @Test
    public void wordBreak() {

        T139 t139 = new T139();

        Assert.assertTrue(
                t139.wordBreak("leetcode", Arrays.asList("leet", "code"))
        );

        Assert.assertTrue(
                t139.wordBreak("applepenapple", Arrays.asList("apple", "pen"))
        );

        Assert.assertFalse(
                t139.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"))
        );

    }

    @Test
    public void wordBreak1() {

        T139 t139 = new T139();

        Assert.assertTrue(
                t139.wordBreak1("leetcode", Arrays.asList("leet", "code"))
        );

        Assert.assertTrue(
                t139.wordBreak1("applepenapple", Arrays.asList("apple", "pen"))
        );

        Assert.assertFalse(
                t139.wordBreak1("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"))
        );

    }

    @Test
    public void wordBreak2() {

        T139 t139 = new T139();

        Assert.assertTrue(
                t139.wordBreak2("leetcode", Arrays.asList("leet", "code"))
        );

        Assert.assertTrue(
                t139.wordBreak2("applepenapple", Arrays.asList("apple", "pen"))
        );

        Assert.assertFalse(
                t139.wordBreak2("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"))
        );

    }

    @Test
    public void wordBreak3() {

        T139 t139 = new T139();

        Assert.assertTrue(
                t139.wordBreak3("leetcode", Arrays.asList("leet", "code"))
        );

        Assert.assertTrue(
                t139.wordBreak3("applepenapple", Arrays.asList("apple", "pen"))
        );

        Assert.assertFalse(
                t139.wordBreak3("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"))
        );



    }



}