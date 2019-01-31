package com.leo.leetcode.sort;

/**
 * 973. 最接近原点的 K 个点
 * https://leetcode-cn.com/problems/k-closest-points-to-origin/description/
 */
public class T973 {

    public int[][] kClosest(int[][] points, int K) {
        if (points.length == 0 || K == 0) return new int[0][];
        int[][] result = new int[K][2];

        int beginIndex = (points.length - 1 - 1) / 2;
        for (int i = beginIndex; i >= 0; i--) {
            siftDown(points, i, points.length);
        }

        for (int i = 0; i < K; i++) {
            siftDown(points, 0, points.length - i);
            result[i] = points[0];
            swap(points, 0, points.length - 1 - i);
        }

        return result;
    }

    private void swap(int[][] points, int a, int b) {
        int[] temp = points[a];
        points[a] = points[b];
        points[b] = temp;
    }

    private void siftDown(int[][] points, int index, int length) {
        int[] key = points[index];
        while ((index * 2 + 1) < length) {
            int childIndex = index * 2 + 1;
            if ((childIndex + 1) < length && comparison(points[childIndex + 1]) < comparison(points[childIndex])) {
                childIndex = childIndex + 1;
            }
            if (comparison(key) <= comparison(points[childIndex])) break;
            points[index] = points[childIndex];
            index = childIndex;
        }
        points[index] = key;
    }

    private double comparison(int[] point) {
        return Math.pow(point[0], 2) + Math.pow(point[1], 2);
    }

}
