package com.leo.algorithm.sort;

import com.leo.utils.Utils;

/**
 * 堆排序
 */
public class HeapSort {

    static void sort(int[] data) {
        if (Utils.isEmpty(data)) {
            return;
        }

        // 构建大根堆
        int beginIndex = (data.length - 1 - 1) / 2;
        for (int i = beginIndex; i >= 0; i--) {
            siftDown(data, i, data.length);
        }

        // 排序
        for (int i = data.length - 1; i > 0; i--) {
            // 交换已经排好序的
            swap(data, 0, i);
            // 下滤，恢复大根堆
            siftDown(data, 0, i);
        }
    }

    // 下滤
    private static void siftDown(int[] data, int index, int len) {
        int key = data[index];
        while ((index * 2 + 1) < len) {
            int childIndex = index * 2 + 1;
            int rightIndex = childIndex + 1;
            if (rightIndex < len && data[rightIndex] > data[childIndex]) {
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

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


}
