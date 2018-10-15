package com.leo.leetcode.dp;

/**
 * 96. 不同的二叉搜索树
 * https://leetcode-cn.com/problems/unique-binary-search-trees/description/
 */
public class T96 {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        // 空树也是搜索树
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

}
