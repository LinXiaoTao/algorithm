package com.leo.leetcode.math;

import java.util.*;

/**
 * 313. 超级丑数
 * https://leetcode-cn.com/problems/super-ugly-number/description/
 */
public class T313 {

    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] result = new int[n];
        result[0] = 1;
        int count = 1;
        int[] indexCount = new int[primes.length];
        Arrays.fill(indexCount, 0);
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
