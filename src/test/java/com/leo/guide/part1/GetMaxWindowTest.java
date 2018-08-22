package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetMaxWindowTest {

    @Test
    public void testGetMaxWindo() {

        int[] array = new int[]{4, 3, 5, 4, 3, 3, 6, 7};
        int[] result = GetMaxWindow.getMaxWindo(array, 3);
        Assert.assertSame(
                result.length,
                array.length - 3 + 1
        );
        Assert.assertArrayEquals(
                result,
                new int[]{5, 5, 5, 4, 6, 7}
        );
        result = GetMaxWindow.getMaxWindo(new int[]{}, 3);
        Assert.assertSame(
                result.length,
                0
        );
    }

}