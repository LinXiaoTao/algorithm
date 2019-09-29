package com.leo.leetcode.arr;

import java.util.Arrays;

/**
 * 1122. 数组的相对排序
 * https://leetcode-cn.com/problems/relative-sort-array/
 */
public class T1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        if (arr1.length == 0 || arr2.length == 0) return new int[0];

        sort(arr1, 0, arr1.length - 1, arr2);


        return arr1;
    }

    private void sort(int[] arr1, int left, int right, int[] arr2) {

        if (left <= right) {
            int mid = getMid(arr1, left, right, arr2);
            sort(arr1, left, mid - 1, arr2);
            sort(arr1, mid + 1, right, arr2);
        }
    }

    private int getMid(int[] arr1, int left, int right, int[] arr2) {


        int value = arr1[left];
        while (left < right) {

            while (left < right && compare(arr1[right], value, arr2) >= 0) right--;
            if (left < right) arr1[left++] = arr1[right];
            while (left < right && compare(arr1[left], value, arr2) < 0) left++;
            if (left < right) arr1[right--] = arr1[left];
        }

        arr1[left] = value;

        return left;
    }

    private int compare(int a, int b, int[] arr2) {


        int index1 = indexOf(a, arr2);
        int index2 = indexOf(b, arr2);

        if (index1 == -1 && index2 == -1) return a - b;

        if (index1 == -1) return 1;

        if (index2 == -1) return -1;

        return index1 - index2;

    }

    private int indexOf(int value, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) return i;
        }

        return -1;
    }

    public int[] relativeSortArray1(int[] arr1, int[] arr2) {
        int[] ref = new int[arr1.length];
        int[] m = new int[1001];
        int n = 0;
        for (int i = 0; i < arr1.length; i++) {
            m[arr1[i]]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            while (m[arr2[i]] > 0) {
                ref[n++] = arr2[i];
                m[arr2[i]]--;

            }
        }
        for (int i = 0; i < 1001; i++) {
            while (m[i] > 0) {
                ref[n++] = i;
                m[i]--;
            }
        }
        return ref;
    }

}
