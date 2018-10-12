package com.leo.leetcode.dp;

/**
 * 70. 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/description/
 */
public class T70 {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        int result = 2;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

}
