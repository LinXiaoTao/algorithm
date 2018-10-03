package com.leo.leetcode.point;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 */
public class T88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 0) {
            return;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        while (j < n) {
            temp[k++] = nums2[j++];
        }
        k = 0;
        while (k < temp.length) {
            nums1[k] = temp[k];
            k++;
        }
    }

}
