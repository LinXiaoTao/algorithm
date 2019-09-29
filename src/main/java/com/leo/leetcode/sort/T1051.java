package com.leo.leetcode.sort;

/**
 * 1051. 高度检查器
 * https://leetcode-cn.com/problems/height-checker/
 */
public class T1051 {

    public int heightChecker(int[] heights) {

        if (heights.length == 0) return 0;

        int[] sortHeights = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            sortHeights[i] = heights[i];
        }

        // sort
        quickSort(sortHeights, 0, sortHeights.length - 1);

        int counter = 0;

        for (int i = 0; i < heights.length; i++) {
            if (sortHeights[i] != heights[i]) {
                counter++;
            }
        }

        return counter;

    }

    private void quickSort(int[] data, int start, int end) {
        if (end <= start) return;
        int mid = getMid(data, start, end);
        quickSort(data, start, mid - 1);
        quickSort(data, mid + 1, end);

    }

    private int getMid(int[] data, int start, int end) {

        int value = data[start];

        while (start < end) {

            while (data[end] >= value && start < end) end--;

            if (start < end) data[start++] = data[end];

            while (data[start] < value && start < end) start++;

            if (start < end) data[end--] = data[start];

        }

        data[start] = value;

        return start;
    }

}
