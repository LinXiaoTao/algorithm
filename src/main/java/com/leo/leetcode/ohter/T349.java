package com.leo.leetcode.ohter;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/description/
 */
public class T349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();
        for (int aNums1 : nums1) {
            map.add(aNums1);
        }
        for (int aNums2 : nums2) {
            if (map.contains(aNums2)) {
                result.add(aNums2);
                map.remove(aNums2);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
