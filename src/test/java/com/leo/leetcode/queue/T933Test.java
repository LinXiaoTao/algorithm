package com.leo.leetcode.queue;

import org.junit.Assert;
import org.junit.Test;

public class T933Test {

    @Test
    public void testRecentCounter() {
        T933.RecentCounter recentCounter = new T933.RecentCounter();
        Assert.assertEquals(
                1,
                recentCounter.ping(1)
        );
        Assert.assertEquals(
                2,
                recentCounter.ping(100)
        );
        Assert.assertEquals(
                3,
                recentCounter.ping(3001)
        );
        Assert.assertEquals(
                3,
                recentCounter.ping(3002)
        );
    }

    @Test
    public void testRecentCounter1() {
        T933.RecentCounter recentCounter = new T933.RecentCounter();
        Assert.assertEquals(
                1,
                recentCounter.ping(1178)
        );
        Assert.assertEquals(
                2,
                recentCounter.ping(1483)
        );
        Assert.assertEquals(
                3,
                recentCounter.ping(1563)
        );
        Assert.assertEquals(
                4,
                recentCounter.ping(4054)
        );
        Assert.assertEquals(
                5,
                recentCounter.ping(4152)
        );
    }

}