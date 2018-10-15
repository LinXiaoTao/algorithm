package com.leo.leetcode.arr;

import java.util.Stack;

/**
 * 922. 按奇偶排序数组 II
 * https://leetcode-cn.com/problems/sort-array-by-parity-ii/description/
 */
public class T922 {

    public int[] sortArrayByParityII(int[] A) {
        if (A.length == 0) {
            return A;
        }
        Stack<Integer> oddStack = new Stack<>();
        Stack<Integer> evenStack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            boolean event = i % 2 == 0;
            if (event && (A[i] % 2 != 0)) {
                // 偶 -> 奇
                oddStack.add(i);
            } else if (!event && (A[i] % 2 == 0)) {
                // 奇 -> 偶
                evenStack.add(i);
            }
            while (!oddStack.isEmpty() && !evenStack.isEmpty()) {
                int temp = A[oddStack.peek()];
                A[oddStack.pop()] = A[evenStack.peek()];
                A[evenStack.pop()] = temp;
            }
        }
        return A;
    }

}
