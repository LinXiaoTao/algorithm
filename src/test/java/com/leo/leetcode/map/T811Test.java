package com.leo.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T811Test {

    @Test
    public void subdomainVisits() {
        T811 t811 = new T811();
        Assert.assertEquals(
                Arrays.asList("9001 com", "9001 leetcode.com", "9001 discuss.leetcode.com"),
                t811.subdomainVisits(new String[]{"9001 discuss.leetcode.com"})
        );
        Assert.assertEquals(
                Arrays.asList("951 com", "900 google.mail.com", "1 intel.mail.com", "5 org", "5 wiki.org", "901 mail.com", "50 yahoo.com"),
                t811.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"})
        );

    }
}