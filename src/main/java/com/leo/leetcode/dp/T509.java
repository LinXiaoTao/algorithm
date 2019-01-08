package com.leo.leetcode.dp;

/**
 * 509. 斐波那契数
 * https://leetcode-cn.com/problems/fibonacci-number/description/
 */
public class T509 {

    public int fib(int N) {
        if (N <= 1) return N;
        int[] cache = new int[31];
        cache[0] = 0;
        cache[1] = 1;
        return fib(N, cache);
    }

    private int fib(int N, int[] cache) {
        if (N == 0) return 0;
        if (cache[N] != 0) return cache[N];
        cache[N] = fib(N - 1, cache) + fib(N - 2, cache);
        return cache[N];
    }

}
