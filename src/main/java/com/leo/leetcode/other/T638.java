package com.leo.leetcode.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 638. 大礼包
 * https://leetcode-cn.com/problems/shopping-offers/description/
 */
public class T638 {

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return shopping(price, special, needs, new HashMap<>());
    }

    private int shopping(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<List<Integer>, Integer> cache) {
        if (cache.containsKey(needs)) {
            return cache.get(needs);
        }
        int cost = dot(price, needs);
        for (List<Integer> sp : special) {
            boolean canUse = true;
            List<Integer> copy = new ArrayList<>(needs);
            for (int i = 0; i < needs.size(); i++) {
                int newNeed = needs.get(i) - sp.get(i);
                if (newNeed < 0) {
                    canUse = false;
                    break;
                }
                copy.set(i, newNeed);
            }
            if (canUse) {
                // 当前礼物可用
                cost = Math.min(
                        cost,
                        sp.get(needs.size()) + shopping(price, special, copy, cache)
                );
            }
        }
        cache.put(needs,cost);
        return cost;
    }

    private int dot(List<Integer> price, List<Integer> needs) {
        int sum = 0;
        for (int i = 0; i < price.size(); i++) {
            sum += price.get(i) * needs.get(i);
        }
        return sum;
    }


}
