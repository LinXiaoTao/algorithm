package com.leo.leetcode.arr;

import java.util.Random;

/**
 * 384. 打乱数组
 * 洗牌算法 https://gaohaoyang.github.io/2016/10/16/shuffle-algorithm/
 * https://leetcode-cn.com/problems/shuffle-an-array/
 */
public class T384 {

    private final int[] original;
    private final Random random;

    public T384(int[] nums) {
        original = nums.clone();
        random = new Random(System.currentTimeMillis());
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return original.clone();
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] result = original.clone();
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            int next = random.nextInt(result.length - i) + i;
            result[i] = result[next];
            result[next] = temp;

        }
        return result;
    }
}
