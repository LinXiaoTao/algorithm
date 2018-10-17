package com.leo.leetcode.dp;

import java.util.List;

/**
 * 120. 三角形最小路径和
 * https://leetcode-cn.com/problems/triangle/description/
 */
public class T120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0 || triangle.get(0).size() == 0) {
            return 0;
        }
        if (triangle.size() == 1){
            return triangle.get(0).get(0);
        }
        // dp[i] 第 n 行的最小路径和的下标
        int[][] dp = new int[triangle.size()][];
        dp[0] = new int[]{triangle.get(0).get(0)};
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            dp[i] = new int[triangle.get(i).size()];
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (dp[i - 1].length <= j) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(
                            dp[i - 1][j],
                            dp[i - 1][j - 1]
                    ) + triangle.get(i).get(j);
                }
                if (i == triangle.size() - 1){
                    result = Math.min(result,dp[i][j]);
                }
            }
        }
        return result;
    }

}

