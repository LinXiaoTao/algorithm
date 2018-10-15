package com.leo.guide.part4;

/**
 * 斐波那契数列
 */
public class Fibonacci {

    /**
     * 递归
     * 时间复杂度：2^N
     */
    public static int fun1(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fun1(n - 1) + fun1(n - 2);
    }

    /**
     * 循环
     * 时间复杂度：N
     */
    public static int fun2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }

    /**
     * 矩阵
     * 时间复杂度：LogN
     * (F(N),F(N-1)) = ((F(N-1),F(N-2)) * ((1,1),(1,0))^(N - 2)
     */
    public static int fun3(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[][] base = {{1, 1}, {1, 0}};
        int[][] res = matrixPower(base, n - 2);
        return res[0][0] + res[1][0];
    }

    // 矩阵的阶乘
    private static int[][] matrixPower(int[][] m, int p) {
        int[][] res = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            // 单位矩阵
            res[i][i] = 1;
        }
        int[][] temp = m;
        while (p != 0) {
            if ((p & 1) == 1) {
                res = muliMatrix(res, temp);
            }
            temp = muliMatrix(temp, temp);
            p = p >> 1;
        }
        return res;
    }

    // 矩阵乘法
    private static int[][] muliMatrix(int[][] m1, int[][] m2) {
        int[][] res = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            // 行
            for (int j = 0; j < m2[0].length; j++) {
                // 列
                for (int k = 0; k < m2.length; k++) {
                    // 行
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }


}
