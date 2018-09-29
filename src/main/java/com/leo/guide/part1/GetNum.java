package com.leo.guide.part1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 题目：
 * 给定数组 arr 和整数 num，共返回有多少个子数组满足以下情况：
 * max(arr[i..j]) - min(arr[i..j]) <= num
 * max(arr[i..j]) 表示子数组 arr[i..j] 中的最大值，min(arr[i..j]) 表示子数组 arr[i..j] 中的最小值
 */
public class GetNum {

    public static int getNum(int[] arr, int num) {
        int res = 0;
        int i = 0;
        int j = 0;
        Deque<Integer> minStack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();
        while (i < arr.length) {
            while (j < arr.length) {
                while (!minStack.isEmpty() && arr[minStack.peekLast()] >= arr[j]) {
                    minStack.pollLast();
                }
                minStack.addLast(j);
                while (!maxStack.isEmpty() && arr[maxStack.peekLast()] <= arr[j]) {
                    maxStack.pollLast();
                }
                maxStack.addLast(j);
                if (arr[maxStack.peekFirst()] - arr[minStack.peekFirst()] > num) {
                    break;
                }
                j++;
            }
            if (maxStack.peekFirst() == i) {
                maxStack.pollFirst();
            }
            if (minStack.peekFirst() == i) {
                minStack.pollFirst();
            }
            res += j - i;
            i++;
        }
        return res;
    }

}
