package com.leo.algorithm.sort;

/**
 * 归并排序
 * 稳定、平均最好最坏都为 O(n * log(n))
 */
class MergeSort {

    static void sort(int[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        int[] temp = new int[data.length];
        sort(data, temp, 0, data.length - 1);
    }

    private static void sort(int[] data, int[] temp, int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            sort(data, temp, left, mid);
            sort(data, temp, mid + 1, right);
            merge(data, temp, left, right, mid);
        }
    }

    private static void merge(int[] data, int[] temp, int left, int right, int mid) {
        int i = left;
        int j = mid + 1;
        int k = 0;

        // 比较，排序
        while ((i <= mid) && (j <= right)) {
            if (data[i] < data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        // 将剩下的元素加入
        while (i <= mid) {
            temp[k++] = data[i++];
        }
        while (j <= right) {
            temp[k++] = data[j++];
        }

        k = 0;
        while (left <= right) {
            data[left++] = temp[k++];
        }
    }

}