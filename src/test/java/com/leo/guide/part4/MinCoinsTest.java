package com.leo.guide.part4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinCoinsTest {

    @Test
    public void minCoins1() {
        Assert.assertEquals(
                4,
                MinCoins.minCoins1(
                        new int[]{5, 2, 3},
                        20
                )
        );
        Assert.assertEquals(
                3,
                MinCoins.minCoins1(
                        new int[]{1, 2, 5},
                        11
                )
        );
        Assert.assertEquals(
                0,
                MinCoins.minCoins1(
                        new int[]{5, 2, 3},
                        0
                )
        );
        Assert.assertEquals(
                -1,
                MinCoins.minCoins1(
                        new int[]{3, 5},
                        2
                )
        );
    }

    @Test
    public void minCoins2() {
        Assert.assertEquals(
                4,
                MinCoins.minCoins2(
                        new int[]{5, 2, 3},
                        20
                )
        );
        Assert.assertEquals(
                3,
                MinCoins.minCoins2(
                        new int[]{1, 2, 5},
                        11
                )
        );
        Assert.assertEquals(
                0,
                MinCoins.minCoins2(
                        new int[]{5, 2, 3},
                        0
                )
        );
        Assert.assertEquals(
                -1,
                MinCoins.minCoins2(
                        new int[]{3, 5},
                        2
                )
        );
    }
}