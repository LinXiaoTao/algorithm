package com.leo.leetcode.string;

import com.leo.leetcode.string.T344;
import org.junit.Assert;
import org.junit.Test;

public class T344Test {

    @Test
    public void reverseString() {
        T344 t344 = new T344();
        Assert.assertEquals("",t344.reverseString(""));
        Assert.assertEquals("a",t344.reverseString("a"));
        Assert.assertEquals("olleh",t344.reverseString("hello"));
        Assert.assertEquals("amanaP :lanac a ,nalp a ,nam A",t344.reverseString("A man, a plan, a canal: Panama"));

    }
}