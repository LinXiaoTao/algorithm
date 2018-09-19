package com.leo.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T451Test {

    @Test
    public void frequencySort() {
        T451 t451 = new T451();
        Assert.assertTrue((t451.frequencySort("tree").equals("eert") || t451.frequencySort("tree").equals("eetr")));
        Assert.assertTrue((t451.frequencySort("cccaaa").equals("cccaaa") || t451.frequencySort("cccaaa").equals("aaaccc")));
        Assert.assertTrue((t451.frequencySort("Aabb").equals("bbAa") || t451.frequencySort("Aabb").equals("bbaA")));

    }
}