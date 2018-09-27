package com.leo.leetcode.heap;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/description/
 */
public class T373 {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>(k);
        // 所有组合
        List<Pair> indexList = new ArrayList<>(nums1.length * nums2.length);
        for (int aNums1 : nums1) {
            for (int aNums2 : nums2) {
                indexList.add(new Pair(aNums1, aNums2));
            }
        }
        // 小根堆
        int beginIndex = ((indexList.size() - 1) - 1) / 2;
        for (int i = beginIndex; i >= 0; i--) {
            siftDown(indexList, i, indexList.get(i), indexList.size());
        }
        while (result.size() < k && result.size() < indexList.size()) {
            Pair first = indexList.get(0);
            result.add(new int[]{first.first, first.second});
            indexList.set(0, indexList.get(indexList.size() - result.size()));
            siftDown(indexList, 0, indexList.get(0), indexList.size() - result.size());
        }
        return result;

    }

    private void siftDown(List<Pair> data, int index, Pair key, int len) {
        while ((index * 2 + 1) < len) {
            int childIndex = index * 2 + 1;
            int rightIndex = childIndex + 1;
            if (rightIndex < len && (data.get(rightIndex).compareTo(data.get(childIndex)) < 0)) {
                childIndex = rightIndex;
            }
            if (key.compareTo(data.get(childIndex)) <= 0) {
                break;
            }
            data.set(index, data.get(childIndex));
            index = childIndex;
        }
        data.set(index, key);

    }

    private class Pair implements Comparable<Pair> {

        private final Integer first;

        private final Integer second;

        private Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }


        @Override
        public int compareTo(Pair o) {
            return (this.first + this.second) - (o.first + o.second);
        }
    }

}
