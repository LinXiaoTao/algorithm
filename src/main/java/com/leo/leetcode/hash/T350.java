package com.leo.leetcode.hash;

import java.util.*;

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

    public int[] intersect1(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0) return new int[0];

        Arrays.sort(nums1);
        Arrays.sort(nums2);


        int k = 0;
        int i = 0;
        int j = 0;


        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
