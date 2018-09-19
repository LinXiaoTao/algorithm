package com.leo.leetcode;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/description
 */
public class T703 {
    // 小根堆
    private final List<Integer> heap;
    private final int mLargest;

    public T703(int k, int[] nums) {
        mLargest = k;
        heap = new ArrayList<>(k);
        for (int i = 0; i < Math.min(k, nums.length); i++) {
            // 构建小根堆
            heap.add(nums[i]);
            siftUp(heap, i, nums[i]);
        }
        if (nums.length > k) {
            for (int i = 0; i < nums.length - k; i++) {
                if (nums[k + i] > heap.get(0)) {
                    siftDown(heap, 0, nums[k + i], heap.size());
                }
            }
        }
    }

    public int add(int val) {
        if (heap.size() < mLargest){
            heap.add(val);
            siftUp(heap, heap.size() - 1 , val);
            return heap.get(0);
        }
        if (val > heap.get(0)) {
            siftDown(heap, 0, val, heap.size());
        }
        return heap.get(0);
    }


    private void siftDown(List<Integer> calculate, int index, int key, int len) {
        while ((index * 2 + 1) < len) {
            int childIndex = index * 2 + 1;
            int rightIndex = childIndex + 1;
            if (len > rightIndex && calculate.get(rightIndex) < calculate.get(childIndex)) {
                childIndex = rightIndex;
            }
            if (key <= calculate.get(childIndex)) {
                break;
            }
            calculate.set(index, calculate.get(childIndex));
            index = childIndex;
        }
        calculate.set(index, key);
    }

    private void siftUp(List<Integer> data, int index, int key) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (key >= data.get(parentIndex)) {
                break;
            }
            data.set(index, data.get(parentIndex));
            index = parentIndex;
        }
        data.set(index, key);
    }
}

/**
 * Your T703 object will be instantiated and called as such:
 * T703 obj = new T703(k, nums);
 * int param_1 = obj.add(val);
 */

