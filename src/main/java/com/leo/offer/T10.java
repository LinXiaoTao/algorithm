package com.leo.offer;

/**
 * 面试题10- I. 斐波那契数列
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class T10 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = a + b;
            temp %= 1000000007;
            a = b;
            b = temp;
            count++;
        }
        return b;
    }
}
