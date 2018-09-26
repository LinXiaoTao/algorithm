package com.leo.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 递归法
 */
public class Recursive {

    public static List<List<Integer>> solve(Integer[] data) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(data, result, 0, data.length - 1);
        return result;
    }

    private static void permutation(Integer[] data, List<List<Integer>> result, int start, int end) {
        if (start > end) {
            result.add(Arrays.asList(data.clone()));
            return;
        }
        for (int i = start; i <= end; i++) {
            if (repeat(data, start, i)) {
                continue;
            }
            swap(data, start, i);
            permutation(data, result, start + 1, end);
            swap(data, i, start);
        }

    }

    private static boolean repeat(Integer[] data, int start, int end) {
        for (int i = start; i < end; i++) {
            if (data[i].intValue() == data[end].intValue()) {
                return true;
            }
        }

        return false;
    }


    private static void swap(Integer[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
