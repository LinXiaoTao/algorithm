package com.leo.leetcode.dp;

/**
 * 887. 鸡蛋掉落
 * https://leetcode-cn.com/problems/super-egg-drop/
 * https://leetcode-cn.com/problems/super-egg-drop/solution/ji-dan-diao-luo-xiang-jie-by-shellbye/
 */
public class T887 {

    // 回溯
    public int superEggDrop(int K, int N) {

        return recursive(K, N);
    }

    private int recursive(int K, int N) {
        if (N == 0 || N == 1 || K == 1) {
            return N;
        }

        int min = N;
        for (int i = 1; i <= N; i++) {
            int result = Math.max(recursive(K - 1, i - 1), recursive(K, N - i));
            min = Math.min(min, result + 1);
        }

        return min;
    }

    // 回溯优化
    public int superEggDrop1(int K, int N) {

        int[][] dp = new int[K + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            dp[0][i] = 0;
            dp[1][i] = i;
        }

        for (int i = 0; i <= K; i++) {
            dp[i][0] = 0;
        }

        for (int i = 2; i <= K; i++) {

            for (int j = 1; j <= N; j++) {

                int min = N;

                for (int k = 1; k <= j; k++) {
                    min = Math.min(min, Math.max(dp[i - 1][k - 1], dp[i][j - k]) + 1);
                }

                dp[i][j] = min;

            }

        }

        return dp[K][N];

    }

}
