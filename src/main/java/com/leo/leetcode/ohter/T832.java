package com.leo.leetcode.ohter;

/**
 * 832. 翻转图像
 * https://leetcode-cn.com/problems/flipping-an-image/description/
 */
public class T832 {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            reverse(A[i]);
        }
        return A;
    }

    private void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (left < right) {
                arr[left] = arr[left] ^ 1;
                arr[right] = arr[right] ^ 1;
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                // ==
                arr[left] = arr[left] ^ 1;
            }
            left++;
            right--;
        }
    }

}
