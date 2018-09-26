package com.leo.leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/insert-delete-getrandom-o1-duplicates-allowed/description/
 */
public class T381 {

    private final Map<Integer, List<Integer>> indexMap = new HashMap<>();
    private final List<Integer> data = new ArrayList<>();

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        List<Integer> indexList = indexMap.computeIfAbsent(val, k -> new ArrayList<>());
        indexList.add(data.size());
        data.add(val);
        return indexList.size() == 1;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        List<Integer> indexList = indexMap.get(val);
        if (indexList != null && !indexList.isEmpty()) {
            int deleteIndex = indexList.remove(0);
            if (deleteIndex != (data.size() - 1)) {
                data.set(deleteIndex, data.get(data.size() - 1));
                indexMap.get(data.get(deleteIndex)).remove(new Integer(data.size() - 1));
                indexMap.get(data.get(deleteIndex)).add(deleteIndex);
            }
            data.remove(data.size() - 1);
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return data.get((int) (Math.random() * data.size()));
    }

}
