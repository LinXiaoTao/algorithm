package com.leo.leetcode.graph;

import java.util.*;

/**
 * 997. 找到小镇的法官
 */
public class T997 {

    public int findJudge(int N, int[][] trust) {

        if (N < 1) return -1;
        if (trust.length == 0 && N == 1) return 1;
        else if (trust.length == 0) return -1;

        // 顶点的入度
        Map<Integer, Integer> inDegree = new HashMap<>();
        // 顶点的出度
        Map<Integer, Integer> outDegree = new HashMap<>();

        for (int i = 0; i < trust.length; i++) {
            // 处理边
            int[] edge = trust[i];

            // 处理入度
            Integer degree = inDegree.get(edge[1]);
            if (degree == null) {
                degree = 0;
            }
            degree++;
            inDegree.put(edge[1], degree);

            // 处理出度
            degree = outDegree.get(edge[0]);
            if (degree == null) {
                degree = 0;
            }
            degree++;
            outDegree.put(edge[0], degree);
        }

        int judge = -1;

        for (int i = 1; i <= N; i++) {
            if (inDegree.containsKey(i) && inDegree.get(i) == N - 1 && !outDegree.containsKey(i)) {
                judge = i;
                break;
            }
        }

        return judge;
    }

}
