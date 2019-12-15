package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class T212Test {

    @Test
    public void findWords() {

        T212 t212 = new T212();

//        Assert.assertEquals(
//                Arrays.asList("oath", "eat"),
//                t212.findWords(
//                        new char[][]{
//                                {'o', 'a', 'a', 'n'},
//                                {'e', 't', 'a', 'e'},
//                                {'i', 'h', 'k', 'r'},
//                                {'i', 'f', 'l', 'v'}
//                        },
//                        new String[]{"oath", "pea", "eat", "rain"}
//                )
//        );

        Assert.assertEquals(
                Collections.emptyList(),
                t212.findWords(
                        new char[][]{
                                {'a', 'a'},
                        },
                        new String[]{"aaa"}
                )
        );

    }
}