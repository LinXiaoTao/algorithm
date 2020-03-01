package com.leo.leetcode.other;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU缓存机制
 * https://leetcode-cn.com/problems/lru-cache/
 */
public class T146 {


    static class LRUCache extends LinkedHashMap<Integer, Integer> {

        private final int maxSize;

        public LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            maxSize = capacity;
        }

        @Override
        public Integer get(Object key) {
            Integer value =  super.get(key);
            if (value == null) return -1;
            return value;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > maxSize;
        }
    }
}

