package com.leo.leetcode.arr;

/**
 * 905. 按奇偶校验排序数组
 * https://leetcode-cn.com/problems/sort-array-by-parity/description/
 */
public class T905 {

    public int[] sortArrayByParity(int[] A) {
        if (A.length == 0) {
            return A;
        }
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            while (left < right && (A[left] % 2) == 0) {
                left++;
            }
            while (left < right && (A[right] % 2) == 1) {
                right--;
            }
            if (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        return A;
    }

    public int[] sortArrayByParity1(int[] A) {
        int len = A.length;
        int[] rt = new int[len];
        //int count;
        int k = 0;
        int j = len - 1;
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                rt[k] = A[i];
                k++;
            } else {
                rt[j] = A[i];
                j--;
            }
        }
        return rt;

    }
}
