package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T208Test {

    @Test
    public void testTrie() {

        T208.Trie trie = new T208.Trie();
        trie.insert("apple");
        Assert.assertTrue(
                trie.search("apple")
        );
        Assert.assertFalse(
                trie.search("app")
        );
        Assert.assertTrue(
                trie.startsWith("app")
        );

        trie.insert("app");
        Assert.assertTrue(
                trie.search("app")
        );
    }

}