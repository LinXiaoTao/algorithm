package com.leo.algorithm;

import com.leo.algorithm.PermutationRecursive;
import org.junit.Test;

import java.util.List;

public class PermutationRecursiveTest {

    @Test
    public void solve() {

        Integer[] data = {1, 2, 3, 4, 4};
        List<List<Integer>> result = PermutationRecursive.solve(data);
        for (List<Integer> aResult : result) {
            System.out.println(aResult);
        }
    }
}