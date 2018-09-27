package com.leo.leetcode.hash;

import com.leo.leetcode.hash.T49;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class T49Test {

    @Test
    public void groupAnagrams() {

        T49 t49 = new T49();
        List<List<String>> result = t49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assert.assertEquals(Arrays.asList(Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("bat"), Arrays.asList( "tan","nat")), result);
        Assert.assertEquals(3, result.size());
    }
}