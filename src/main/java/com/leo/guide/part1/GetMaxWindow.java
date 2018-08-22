package com.leo.guide.part1;

import java.util.LinkedList;

/**
 * 题目：
 * 有一个整型数组 arr 和一个大小为 w 的窗口从数组的最左边滑到最右边，窗口每次向右边滑一个位置，输出长度为 n-w+1 的数组 res，res[i] 表示
 * 每一种窗口状态下的最大值
 * 要求：
 * 时间复杂度为 O(N)
 */
public class GetMaxWindow {

    public static int[] getMaxWindo(int[] arr, int w) {
        if (arr.length < w) {
            return new int[0];
        }
        int result[] = new int[arr.length - w + 1];
        LinkedList<Integer> qmax = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == (i - w)) {
                qmax.pollFirst();
            }
            if (i >= (w - 1)) {
                result[index++] = arr[qmax.peekFirst()];
            }
        }
        return result;
    }

}
