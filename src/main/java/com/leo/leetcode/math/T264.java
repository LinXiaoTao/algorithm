package com.leo.leetcode.math;

/**
 * 264. 丑数 II
 * https://leetcode-cn.com/problems/ugly-number-ii/description/
 */
public class T264 {

    public int nthUglyNumber(int n) {

        int[] primes = {2, 3, 5};

        int[] result = new int[n];
        result[0] = 1;
        int count = 1;
        int[] indexCount = new int[primes.length];
        while (count < n) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < primes.length; i++) {
                min = Math.min(
                        min,
                        result[indexCount[i]] * primes[i]
                );
            }

            // 遍历的原因：排除重复值
            for (int i = 0; i < primes.length; i++) {
                if (result[indexCount[i]] * primes[i] == min) {
                    indexCount[i] = indexCount[i] + 1;
                }
            }

            result[count++] = min;
        }
        return result[n - 1];

    }

}
