package com.leo.massive;

import java.util.BitSet;

/**
 * 布隆过滤器
 * 使用一个超大的位数组和几个哈希函数实现某个数据是否存在于大量数据之中
 * <a>https://www.jianshu.com/p/88c6ac4b38c8</a>
 */
public class BloomFilter {

    private static final int DEFAULT_SIZE = 2 << 24;
    private static final int[] SEEDS = new int[]{7, 11, 13, 31, 37, 61};

    private final BitSet bitSet = new BitSet(DEFAULT_SIZE);
    private final Hash[] hashes = new Hash[SEEDS.length];

    public BloomFilter() {
        for (int i = 0; i < SEEDS.length; i++) {
            hashes[i] = new Hash(DEFAULT_SIZE, SEEDS[i]);
        }
    }

    public void add(String value) {
        for (Hash hash : hashes) {
            // 将 hash 对应的位设置位 true
            bitSet.set(hash.hash(value), true);
        }
    }

    public boolean contains(String value) {
        boolean result = true;
        for (Hash hash : hashes) {
            // 只要存在一位不等于 true，则认为不存在
            result = result & bitSet.get(hash.hash(value));
        }
        return result;
    }

    private static class Hash {

        private final int cap;
        private final int seed;

        private Hash(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }

        private int hash(String value) {
            int result = 0;
            for (int i = 0; i < value.length(); i++) {
                result = seed * result + value.charAt(i);
            }
            // 取模运算
            return (cap - 1) & result;
        }
    }

}
