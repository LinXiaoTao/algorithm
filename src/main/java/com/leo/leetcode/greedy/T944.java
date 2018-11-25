package com.leo.leetcode.greedy;

/**
 * 944. 删除列以使之有序
 * https://leetcode-cn.com/problems/delete-columns-to-make-sorted/description/
 */
public class T944 {

    public int minDeletionSize(String[] A) {
        if (A.length == 0 || A[0].length() == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) - A[j - 1].charAt(i) < 0) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

}
