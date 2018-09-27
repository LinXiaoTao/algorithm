package com.leo.leetcode.hash;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/group-anagrams/description/
 */
public class T49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String[] splitArr = strs[i].split("");
            // 字符串排序
            Arrays.sort(splitArr);
            String sortString = String.join("", splitArr);
            List<Integer> countList = map.get(sortString);
            if (countList == null) {
                countList = new ArrayList<>();
            }
            countList.add(i);
            map.put(sortString, countList);
        }
        Set<Map.Entry<String, List<Integer>>> entries = map.entrySet();
        for (Map.Entry<String, List<Integer>> entry : entries) {
            List<String> strings = new ArrayList<>(entry.getValue().size());
            for (Integer index : entry.getValue()) {
                strings.add(strs[index]);
            }
            result.add(strings);
        }
        return result;
    }

}
