package com.leo.leetcode.arr;

/**
 * 605. 种花问题
 * https://leetcode-cn.com/problems/can-place-flowers/
 */
public class T605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0) {
            return false;
        }
        int[] result = new int[flowerbed.length + 2];
        for (int i = 0; i < flowerbed.length; i++) {
            result[i + 1] = flowerbed[i];
        }
        result[result.length - 1] = 0;
        result[0] = 0;
        int count = 0;
        for (int i = 1; i < (result.length - 1); i++) {
            if (result[i - 1] == 0 && result[i] == 0 && result[i + 1] == 0) {
                count++;
                i++;
            }
        }
        return n <= count;
    }

}
