package com.leo.leetcode.heap;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/sort-characters-by-frequency/description/
 */
public class T451 {
    public String frequencySort(String s) {
        String[] words = s.split("");
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            Integer count = countMap.get(word);
            if (count == null) {
                count = 0;
            }
            countMap.put(word, ++count);
        }
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            // 小根堆
            siftUp(countMap, i, words[i], result);
        }

        // 堆排序
        for (int i = words.length - 1; i > 0; i--) {
            String temp = result[i];
            result[i] = result[0];
            result[0] = temp;
            siftDown(countMap, 0, result[0], result, i);
        }

        return String.join("", result);
    }

    // 上滤
    private void siftUp(Map<String, Integer> countMap, int index, String key, String[] result) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (compareTo(countMap, key, result[parentIndex]) >= 0) {
                break;
            }
            result[index] = result[parentIndex];
            index = parentIndex;
        }
        result[index] = key;
    }

    // 下滤
    private void siftDown(Map<String, Integer> countMap, int index, String key, String[] result, int len) {
        while ((index * 2 + 1) < len) {
            int childIndex = (index * 2) + 1;
            int rightIndex = childIndex + 1;
            if (rightIndex < len && compareTo(countMap, result[rightIndex], result[childIndex]) < 0) {
                childIndex = rightIndex;
            }
            if (compareTo(countMap, key, result[childIndex]) <= 0) {
                break;
            }
            result[index] = result[childIndex];
            index = childIndex;
        }
        result[index] = key;
    }

    private int compareTo(Map<String, Integer> countMap, String key1, String key2) {
        if (countMap.get(key1).intValue() == countMap.get(key2).intValue()) {
            return key1.compareTo(key2);
        } else {
            return countMap.get(key1) - countMap.get(key2);
        }
    }

}
