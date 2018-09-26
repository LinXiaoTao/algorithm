package com.leo.leetcode.heap;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/top-k-frequent-words/description/
 */
public class T692 {

    public List<String> topKFrequent(String[] words, int k) {
        // 大根堆
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            Integer count = countMap.get(word);
            if (count == null) {
                count = 0;
            }
            countMap.put(word, count + 1);
        }
        words = new String[countMap.keySet().size()];
        countMap.keySet().toArray(words);
        int beginIndex = ((words.length - 1) - 1) / 2;
        for (int i = beginIndex; i >= 0; i--) {
            // 下滤
            siftDown(words, countMap, words[i], i, words.length);
        }
        List<String> result = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            result.add(words[0]);
            words[0] = words[words.length - 1 - i];
            siftDown(words, countMap, words[0], 0, words.length - 1 - i);
        }
        return result;

    }

    private void siftDown(String[] words, Map<String, Integer> countMap, String key, int index, int len) {

        while ((index * 2 + 1) < len) {
            int childIndex = index * 2 + 1;
            int rightIndex = childIndex + 1;
            if (rightIndex < len && (comparison(countMap, words[rightIndex], words[childIndex]) > 0)) {
                childIndex = rightIndex;
            }
            if (comparison(countMap, key, words[childIndex]) >= 0) {
                break;
            }
            words[index] = words[childIndex];
            index = childIndex;
        }

        words[index] = key;
    }

    private int comparison(Map<String, Integer> countMap, String one, String two) {
        if (countMap.get(one).equals(countMap.get(two))) {
            return one.compareTo(two) * -1;
        } else {
            return countMap.get(one).compareTo(countMap.get(two));
        }
    }

}
