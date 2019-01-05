package com.leo.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 961. 重复 N 次的元素
 * https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/description/
 */
public class T961 {

    public int repeatedNTimes(int[] A) {
        Map<Integer, Boolean> map = new HashMap<>(A.length / 2 + 1);
        for (int val : A) {
            if (map.containsKey(val)) {
                return val;
            }
            map.put(val, Boolean.TRUE);
        }
        return -1;
    }

}
