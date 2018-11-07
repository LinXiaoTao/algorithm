package com.leo.leetcode.dp;

/**
 * 338. 比特位计数
 * https://leetcode-cn.com/problems/counting-bits/description/
 */
public class T338 {

    public int[] countBits(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= num; i++) {
            int temp = i;
            int count = -1;
            while (temp > 0) {
                temp = temp >> 1;
                count++;
            }
            dp[i] = dp[i ^ (1 << count)] + 1;
        }
        return dp;
    }

    public int[] countBits1(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i < num + 1; i++)
            res[i] = 0;
        for (int i = 1; i < num + 1; i++)
            res[i] = res[i & (i - 1)] + 1;
        return res;
    }


}
