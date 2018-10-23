package com.leo.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 657. 机器人能否返回原点
 * https://leetcode-cn.com/problems/robot-return-to-origin/description/
 */
public class T657 {

    public boolean judgeCircle(String moves) {
        if (moves.length() == 0) {
            return true;
        }
        Map<Character, Integer> countMap = new HashMap<>(4);
        for (int i = 0; i < moves.length(); i++) {
            countMap.put(
                    moves.charAt(i),
                    countMap.getOrDefault(moves.charAt(i), 0) + 1
            );
        }
        return countMap.getOrDefault('L', 0).intValue() == countMap.getOrDefault('R', 0).intValue() &&
                countMap.getOrDefault('U', 0).intValue() == countMap.getOrDefault('D', 0).intValue();
    }

}
