package com.leo.leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/insert-delete-getrandom-o1/description/
 */
public class T380 {

    private final Map<Integer, Integer> indexMap = new HashMap<>();
    private final List<Integer> data = new ArrayList<>();

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (!indexMap.containsKey(val)) {
            indexMap.put(val, data.size());
            data.add(val);
            return true;
        }
        return false;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (indexMap.containsKey(val)) {
            int deleteIndex = indexMap.get(val);
            indexMap.remove(val);
            if (deleteIndex != (data.size() - 1)) {
                // 不等于最后一个
                data.set(deleteIndex, data.get(data.size() - 1));
                indexMap.put(data.get(deleteIndex), deleteIndex);
            }
            // 删除最后一个
            data.remove(data.size() - 1);
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return data.get((int) (Math.random() * data.size()));
    }

}
