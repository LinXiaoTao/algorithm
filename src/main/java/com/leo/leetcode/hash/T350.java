package com.leo.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/description/
 */
public class T350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int aNums1 : nums1) {
            Integer count = map.get(aNums1);
            if (count == null) {
                count = 0;
            }
            map.put(aNums1, count + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            Integer count = map.get(nums2[i]);
            if (count != null) {
                count -= 1;
                map.put(nums2[i], count);
                if (count >= 0) {
                    result.add(nums2[i]);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
