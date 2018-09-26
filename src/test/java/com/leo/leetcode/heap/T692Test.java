package com.leo.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T692Test {

    @Test
    public void topKFrequent() {
        T692 t692 = new T692();
        String[] data = {"i", "love", "leetcode", "i", "love", "coding"};
        Assert.assertEquals(Arrays.asList("i", "love"), t692.topKFrequent(data, 2));

        String[] data1 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        Assert.assertEquals(Arrays.asList("the", "is", "sunny", "day"), t692.topKFrequent(data1, 4));

        String[] data2 = {"i", "love", "leetcode", "i", "love", "coding"};
        Assert.assertEquals(Arrays.asList("i", "love", "coding"), t692.topKFrequent(data2, 3));
    }
}