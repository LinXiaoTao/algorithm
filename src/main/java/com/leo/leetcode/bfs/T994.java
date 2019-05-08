package com.leo.leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. 腐烂的橘子
 * https://leetcode-cn.com/problems/rotting-oranges/
 */
public class T994 {

    public int orangesRotting(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int good = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    good++;
                } else if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        if (good == 0) return 0;
        if (good > 0 && queue.isEmpty()) return -1;

        int count = -1;

        int[][] direction = new int[][]{
                {0, 1},
                {1, 0},
                {-1, 0},
                {0, -1}
        };

        while (!queue.isEmpty()) {

            int cur = queue.size();
            for (int i = 0; i < cur; i++) {
                int[] pos = queue.poll();
                for (int[] ints : direction) {
                    int x = pos[0] + ints[0];
                    int y = pos[1] + ints[1];

                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        good--;
                        queue.offer(new int[]{x, y});
                    }

                }

            }

            count++;
        }

        return good == 0 ? count : -1;
    }

}
