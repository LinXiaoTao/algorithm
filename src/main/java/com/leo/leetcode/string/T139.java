package com.leo.leetcode.string;

import java.util.*;

/**
 * 139. 单词拆分
 * https://leetcode-cn.com/problems/word-break/
 */
public class T139 {

    // 暴力回溯
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakHelper(s, wordDict, 0);
    }

    private boolean wordBreakHelper(String s, List<String> wordDict, int start) {

        if (start >= s.length()) {
            return true;
        }

        for (int i = start; i < s.length(); i++) {
            if (wordDict.contains(s.substring(start, i + 1)) && wordBreakHelper(s, wordDict, i + 1)) {
                return true;
            }

        }

        return false;
    }


    // 回溯优化
    public boolean wordBreak1(String s, List<String> wordDict) {
        return wordBreakHelper1(s, wordDict, 0, new HashMap<>());
    }

    private boolean wordBreakHelper1(String s, List<String> wordDict, int start, Map<Integer, Boolean> cache) {

        if (start >= s.length()) return true;

        if (cache.containsKey(start)) return cache.get(start);

        for (int i = start; i < s.length(); i++) {
            if (wordDict.contains(s.substring(start, i + 1)) && wordBreakHelper1(s, wordDict, i + 1, cache)) {
                cache.put(start, true);
                return true;
            }
        }
        cache.put(start, false);
        return false;

    }

    // BFS 广度优先搜索
    public boolean wordBreak2(String s, List<String> wordDict) {

        if (s.length() == 0) return true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        int[] visited = new int[s.length()];

        while (!queue.isEmpty()) {
            int start = queue.poll();

            if (visited[start] == 1) continue;

            for (int i = start; i < s.length(); i++) {

                if (wordDict.contains(s.substring(start, i + 1))) {
                    if (i + 1 == s.length()) {
                        return true;
                    }
                    queue.offer(i + 1);
                }


            }

            visited[start] = 1;
        }

        return false;
    }

    // 动态规划
    public boolean wordBreak3(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {

                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }

            }
        }

        return dp[s.length()];
    }
}
