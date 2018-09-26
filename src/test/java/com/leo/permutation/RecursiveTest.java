package com.leo.permutation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RecursiveTest {

    @Test
    public void solve() {

        Integer[] data = {1, 2, 3, 4, 4};
        List<List<Integer>> result = Recursive.solve(data);
        for (List<Integer> aResult : result) {
            System.out.println(aResult);
        }
    }
}