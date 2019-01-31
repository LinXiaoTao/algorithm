package com.leo.leetcode.binary;

import java.math.BigDecimal;

/**
 * 50. Pow(x, n)
 * https://leetcode-cn.com/problems/powx-n/description/
 */
public class T50 {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        int t = n / 2;
        if (n < 0) {
            t = -t;
            x = 1 / x;
        }
        double num = myPow(x, t);
        return (n % 2 == 0) ? num * num : x * num * num;
    }

}
