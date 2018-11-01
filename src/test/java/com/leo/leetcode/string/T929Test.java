package com.leo.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T929Test {

    @Test
    public void numUniqueEmails() {
        T929 t929 = new T929();

        Assert.assertEquals(
                2,
                t929.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"})
        );
    }
}