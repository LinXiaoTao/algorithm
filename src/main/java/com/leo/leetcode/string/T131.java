package com.leo.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 131. 分割回文串
 * https://leetcode-cn.com/problems/palindrome-partitioning/
 * https://leetcode-cn.com/problems/palindrome-partitioning/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-3-7/
 */
public class T131 {

    // 分治
    public List<List<String>> partition(String s) {

        if (s.length() == 0) return Collections.emptyList();
        return partitionHelper(s, 0);
    }

    private List<List<String>> partitionHelper(String s, int start) {

        if (start >= s.length()) {
            List<List<String>> result = new ArrayList<>();
            List<String> empty = new ArrayList<>();
            result.add(empty);
            return result;
        }

        List<List<String>> result = new ArrayList<>();

        for (int i = start; i < s.length(); i++) {

            String left = s.substring(start, i + 1);

            if (!isPartition(left)) {
                continue;
            }

            for (List<String> item : partitionHelper(s, i + 1)) {
                item.add(0, left);
                result.add(item);
            }
        }

        return result;

    }

    private boolean isPartition(String s) {

        if (s.length() < 2) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (end > start) {

            if (s.substring(start, start + 1).equals(s.substring(end, end + 1))) {
                start++;
                end--;
            } else {
                return false;
            }

        }

        return true;

    }


    // 分治优化
    public List<List<String>> partition1(String s) {

        if (s.length() == 0) return Collections.emptyList();
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                dp[j][i] = ((((i - j) < 3) || (dp[j + 1][i - 1])) && s.substring(i, i + 1).equals(s.substring(j, j + 1)));
            }
        }

        return partitionHelper1(s, 0, dp);
    }

    private List<List<String>> partitionHelper1(String s, int start, boolean[][] dp) {

        if (start >= s.length()) {
            List<List<String>> result = new ArrayList<>();
            List<String> empty = new ArrayList<>();
            result.add(empty);
            return result;
        }

        List<List<String>> result = new ArrayList<>();

        for (int i = start; i < s.length(); i++) {

            String left = s.substring(start, i + 1);

            if (!dp[start][i]) {
                continue;
            }

            for (List<String> item : partitionHelper1(s, i + 1, dp)) {
                item.add(0, left);
                result.add(item);
            }
        }

        return result;

    }

    // 分治优化
    public List<List<String>> partition2(String s) {

        if (s.length() == 0) return Collections.emptyList();
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                dp[j][i] = ((((i - j) < 3) || (dp[j + 1][i - 1])) && s.substring(i, i + 1).equals(s.substring(j, j + 1)));
            }
        }


        List<List<String>> result = new ArrayList<>();
        partitionHelper2(s, 0, dp, new ArrayList<>(), result);
        return result;
    }


    // 回溯
    private void partitionHelper2(String s, int start, boolean[][] dp, List<String> temp, List<List<String>> result) {

        if (start >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (!dp[start][i]) {
                continue;
            }
            String left = s.substring(start, i + 1);
            temp.add(left);
            partitionHelper2(s, i + 1, dp, temp, result);
            temp.remove(temp.size() - 1);
        }


    }

}
