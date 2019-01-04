package com.leo.leetcode.dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 646. 最长数对链
 * https://leetcode-cn.com/problems/maximum-length-of-pair-chain/description/
 */
public class T646 {


    public int findLongestChain(int[][] pairs) {
        if (pairs.length == 0) {
            return 0;
        }
        if (pairs.length == 1) {
            return 1;
        }
        int[] dp = new int[pairs.length];
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));
        dp[0] = 1;
        for (int i = 1; i < pairs.length; i++) {
            int pre = i;

            while (pre > -1 && pairs[i][0] <= pairs[pre][1]) {
                // 可以连接
                pre--;
            }
            if (pre > -1) {
                dp[i] = dp[pre] + 1;
            } else {
                dp[i] = 1;
            }

        }
        return dp[pairs.length - 1];
    }

    public int findLongestChain1(int[][] pairs) {
        if (pairs.length == 0) {
            return 0;
        }
        if (pairs.length == 1) {
            return 1;
        }
        Arrays.sort(pairs, (o1, o2) -> o1[1] - o2[1]);
        int count = 1;
        int foot = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > foot) {
                foot = pairs[i][1];
                count++;
            }
        }
        return count;
    }

    public int findLongestChain2(int[][] pairs) {
        if (pairs.length == 0) {
            return 0;
        }
        if (pairs.length == 1) {
            return 1;
        }
        quickSort(pairs, 0, pairs.length - 1);
        int count = 1;
        int foot = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > foot) {
                foot = pairs[i][1];
                count++;
            }
        }
        return count;
    }

    private void quickSort(int[][] pairs, int i, int j) {
        if (j > i) {
            int mid = getMid(pairs, i, j);
            quickSort(pairs, i, mid - 1);
            quickSort(pairs, mid + 1, j);
        }
    }

    private int getMid(int[][] pairs, int i, int j) {
        int[] temp = pairs[i];
        while (i < j) {
            while (i < j && pairs[j][1] > temp[1]) {
                j--;
            }
            if (i < j) {
                int[] value = pairs[i];
                pairs[i] = pairs[j];
                pairs[j] = value;
            }
            while (i < j && pairs[i][1] <= temp[1]) {
                i++;
            }
            if (i < j) {
                int[] value = pairs[i];
                pairs[i] = pairs[j];
                pairs[j] = value;
            }
        }
        pairs[i] = temp;
        return i;
    }

}
