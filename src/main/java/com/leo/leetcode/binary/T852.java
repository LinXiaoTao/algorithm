package com.leo.leetcode.binary;

/**
 * 852. 山脉数组的峰顶索引
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/description/
 */
public class T852 {

    public int peakIndexInMountainArray(int[] A) {
        // 0,2,1,0
        if (A.length == 0) {
            return -1;
        }
        if (A.length == 1) {
            return 0;
        }
        return binarySearch(0, A.length - 1, A);
    }

    private int binarySearch(int left, int right, int[] A) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int leftVal = Integer.MIN_VALUE;
        if ((mid - 1) >= 0) {
            leftVal = A[mid - 1];
        }
        int rightVal = Integer.MIN_VALUE;
        if ((mid + 1) < A.length) {
            rightVal = A[mid + 1];
        }
        if (A[mid] > leftVal && A[mid] > rightVal) {
            return mid;
        } else if (A[mid] <= leftVal) {
            return binarySearch(left, mid - 1, A);
        } else {
            return binarySearch(mid + 1, right, A);
        }

    }

}
