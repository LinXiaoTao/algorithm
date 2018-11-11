package com.leo.guide.part4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinCoinsExpansionTest {

    @Test
    public void minCoins1() {
        Assert.assertEquals(
                4,
                MinCoinsExpansion.minCoins1(
                        new int[]{5, 2, 3, 5, 5, 5},
                        20
                )
        );
        Assert.assertEquals(
                0,
                MinCoinsExpansion.minCoins1(
                        new int[]{5, 2, 3},
                        0
                )
        );
        Assert.assertEquals(
                -1,
                MinCoinsExpansion.minCoins1(
                        new int[]{3, 5},
                        2
                )
        );
    }

    @Test
    public void minCoins2() {
        Assert.assertEquals(
                4,
                MinCoinsExpansion.minCoins2(
                        new int[]{5, 2, 3, 5, 5, 5},
                        20
                )
        );
        Assert.assertEquals(
                0,
                MinCoinsExpansion.minCoins2(
                        new int[]{5, 2, 3},
                        0
                )
        );
        Assert.assertEquals(
                -1,
                MinCoinsExpansion.minCoins2(
                        new int[]{3, 5},
                        2
                )
        );
    }
}