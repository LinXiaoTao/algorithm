package com.leo.leetcode.point;

/**
 * 977. 有序数组的平方
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
public class T977 {

    public int[] sortedSquares(int[] A) {
        if (A.length == 0) {
            return new int[0];
        }
        if (A.length == 1) {
            return new int[]{A[0] * A[0]};
        }
        int left = 0;
        int right = A.length - 1;
        int[] result = new int[A.length];
        int count = result.length - 1;
        while (left <= right) {
            int x = A[left] * A[left];
            int y = A[right] * A[right];
            if (x <= y) {
                result[count--] = y;
                right--;
            } else {
                result[count--] = x;
                left++;
            }
        }
        return result;

    }

}
