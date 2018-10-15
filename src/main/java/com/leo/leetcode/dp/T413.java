package com.leo.leetcode.dp;

/**
 * 413. 等差数列划分
 * https://leetcode-cn.com/problems/arithmetic-slices/description/
 */
public class T413 {

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        int sum = 0;
        // dp[i][j] 从 i 起到 j 有多少个等差数列
        int[][] dp = new int[A.length][A.length];
        for (int i = 0; i < (A.length - 2); i++) {
            for (int size = 3; size <= A.length; size++) {
                int j = i + size - 1;
                if (j >= A.length) {
                    break;
                }
                if (size == 3) {
                    if ((A[i + 1] - A[i]) == (A[i + 2] - A[i + 1])) {
                        // 等差
                        dp[i][i + 2] = 1;
                        sum++;
                    }
                } else {
                    // size > 3
                    if ((A[j - 1] - A[j - 2] == (A[j] - A[j - 1])) && dp[i][j - 1] > 0) {
                        // 等差
                        dp[i][j] = dp[i][j - 1] + 1;
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    public int numberOfArithmeticSlices1(int[] A) {
        if (A.length < 3) return 0;
        int diff = A[1] - A[0];
        int startIndex = 0;
        int result = 0;
        for (int i = 2; i <= A.length; ++i) {
            if (i == A.length || A[i] - A[i - 1] != diff) {
                if (i - 1 - startIndex >= 2) {
                    int n = i - 1 - startIndex;
                    int p = 1;
                    for (int j = 2; j <= n; ++j) {
                        result += p;
                        p++;
                    }
                }
                startIndex = i - 1;
                if (i < A.length) {
                    diff = A[i] - A[i - 1];
                }
            }
        }
        return result;
    }

    public int numberOfArithmeticSlices3(int[] A) {
        int length = A.length;
        if (length < 3) {
            return 0;
        }
        int[] re = new int[length + 1];
        re[0] = 0;
        re[1] = 0;
        re[2] = 0;

        int beforeNumber = 0;
        for (int i = 3; i < length + 1; i++) {
            boolean isCurrentTrue = isTrue(A[i - 1], A[i - 2], A[i - 3]);
            if (beforeNumber == 0) {
                if (isCurrentTrue) {
                    re[i] = re[i - 1] + 1;
                    beforeNumber = 3;
                } else {
                    re[i] = re[i - 1];
                }
            } else {
                if (isCurrentTrue) {
                    re[i] = re[i - 1] + (beforeNumber - 1);
                    beforeNumber++;
                } else {
                    re[i] = re[i - 1];
                    beforeNumber = 0;
                }
            }
        }
        return re[length];


    }

    public boolean isTrue(int a, int b, int c) {
        return (b - a) == (c - b);
    }

}
