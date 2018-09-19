package com.leo.leetcode.heap;

/**
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
 */
public class T378 {

    public int kthSmallest(int[][] matrix, int k) {
        int[] heap = new int[k];
        // 大根堆
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (count < k) {
                    siftUp(heap, count, matrix[i][j]);
                } else {
                    if (matrix[i][j] < heap[0]) {
                        siftDown(heap, 0, matrix[i][j], heap.length);
                    }
                }
                count++;
            }
        }
        return heap[0];
    }

    private void siftUp(int[] data, int index, int key) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (key <= data[parentIndex]) {
                break;
            }
            data[index] = data[parentIndex];
            index = parentIndex;
        }
        data[index] = key;
    }

    private void siftDown(int[] data, int index, int key, int len) {
        while ((index * 2 + 1) < len) {
            int childIndex = index * 2 + 1;
            int rightIndex = childIndex + 1;
            if (len > rightIndex && data[rightIndex] > data[childIndex]) {
                childIndex = rightIndex;
            }
            if (key >= data[childIndex]) {
                break;
            }
            data[index] = data[childIndex];
            index = childIndex;
        }
        data[index] = key;
    }
}
