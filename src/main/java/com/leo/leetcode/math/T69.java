package com.leo.leetcode.math;

/**
 * 69. x 的平方根
 * https://leetcode-cn.com/problems/sqrtx/description/
 */
public class T69 {

    public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        if (x <= 1) {
            return 1;
        }
        int start = 2;
        int value = 0;
        while (start != (value = (start + x / start) / 2)) {
            if (start > value) {
                return start - 1;
            }
            start++;
        }
        return start;
    }

    public int mySqrt1(int x) {
        if (x == 0) return 0;
        long sqrt = x;
        while (sqrt * sqrt > x) {
            sqrt = (sqrt + x / sqrt) / 2;
        }
        return (int) sqrt;
    }

}
