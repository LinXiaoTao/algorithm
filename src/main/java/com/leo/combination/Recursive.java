package com.leo.combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 递归法
 */
public class Recursive {

    public static List<List<Integer>> solve(Integer[] data, int m) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> used = new HashSet<>();
        combination(data, result, new ArrayList<>(), 0, data.length - 1, m, used);
        return result;
    }

    private static void combination(Integer[] data, List<List<Integer>> result, List<Integer> calculate, int start, int end, int m, Set<Integer> used) {

        if (calculate.size() == m) {
            result.add(new ArrayList<>(calculate));
            return;
        }

        if (start > end) {
            return;
        }

        calculate.add(data[start]);
        combination(data, result, calculate, start + 1, end, m, used);

        calculate.remove(calculate.size() - 1);
        combination(data, result, calculate, start + 1, end, m, used);

        used.add(data[start]);

    }

}
