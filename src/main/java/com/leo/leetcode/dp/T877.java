package com.leo.leetcode.dp;

/**
 * 877. 石子游戏
 * https://leetcode-cn.com/problems/stone-game/description/
 */
public class T877 {

    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for (int i = 0; i < piles.length; i++) {
            dp[i][i] = piles[i];
        }
        for (int size = 1; size < piles.length; size++) {
            for (int i = 0; i < (piles.length - size); i++) {
                int j = i + size;
                dp[i][j] = Math.max(
                        // 先选
                        piles[i] - dp[i + 1][j],
                        piles[j] - dp[i][j - 1]
                );
            }
        }
        return dp[0][piles.length - 1] > 0;
    }

}
