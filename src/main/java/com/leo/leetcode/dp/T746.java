package com.leo.leetcode.dp;

/**
 * 746. 使用最小花费爬楼梯
 * https://leetcode-cn.com/problems/min-cost-climbing-stairs/description/
 */
public class T746 {

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0 || cost.length == 1) {
            return 0;
        }
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int[] cache = new int[cost.length];
        cache[0] = cost[0];
        cache[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            cache[i] = Math.min(
                    cache[i - 2] + cost[i],
                    cache[i - 1] + cost[i]
            );

        }
        return Math.min(cache[cost.length - 1], cache[cost.length - 2]);
    }

}
