package com.leo.leetcode.map;

import java.util.*;

/**
 * 811. 子域名访问计数
 * https://leetcode-cn.com/problems/subdomain-visit-count/description/
 */
public class T811 {

    public List<String> subdomainVisits(String[] cpdomains) {
        if (cpdomains.length == 0) return Collections.emptyList();
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            // 统计
            String[] space = cpdomain.split(" ");
            if (space.length < 2) continue;
            int count = Integer.valueOf(space[0]);
            String[] arr = space[1].split("\\.");
            // 一级域名
            map.put(arr[arr.length - 1], map.getOrDefault(arr[arr.length - 1], 0) + count);
            // 二级域名
            map.put(arr[arr.length - 2] + "." + arr[arr.length - 1],
                    map.getOrDefault(arr[arr.length - 2] + "." + arr[arr.length - 1], 0) + count
            );
            // 可能三级域名
            if (arr.length > 2) {
                map.put(space[1], map.getOrDefault(space[1], 0) + count);
            }
        }
        List<String> result = new ArrayList<>(map.keySet().size());
        for (String key : map.keySet()) {
            result.add(String.format( "%s %s", String.valueOf(map.get(key)), key));
        }
        return result;
    }

}
