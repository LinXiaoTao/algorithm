package com.leo.leetcode.math;

import java.util.Arrays;

/**
 * 908. 最小差值 I
 * https://leetcode-cn.com/problems/smallest-range-i/description/
 */
public class T908 {

    public int smallestRangeI(int[] A, int K) {
        if (A.length <= 1) {
            return 0;
        }
        Arrays.sort(A);
        return Math.max(A[A.length - 1] - K - (A[0] + K), 0);
    }

}
