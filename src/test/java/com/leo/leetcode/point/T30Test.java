package com.leo.leetcode.point;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T30Test {

    @Test
    public void findSubstring() {
        T30 t30 = new T30();

        Assert.assertEquals(Arrays.asList(0, 9), t30.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        Assert.assertEquals(Arrays.asList(), t30.findSubstring("wordgoodstudentgoodword", new String[]{"word", "student"}));


    }
}