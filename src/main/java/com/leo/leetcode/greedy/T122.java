package com.leo.leetcode.greedy;

/**
 * 122. 买卖股票的最佳时机 II
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class T122 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int index = 0;
        int total = 0;
        int buy = -1;

        while (index < prices.length) {

            if (buy == -1) {

                if ((index + 1) < prices.length) {
                    if (prices[index] < prices[index + 1]) {
                        buy = index;
                    }
                }

            } else {

                if ((index + 1) < prices.length) {
                    if (prices[index] > prices[index + 1]) {
                        total += prices[index] - prices[buy];
                        buy = -1;
                    }
                } else {
                    // 最后一个，只能卖了
                    total += prices[index] - prices[buy];
                }

            }

            index++;

        }

        return total;
    }

}
