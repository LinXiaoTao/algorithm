package com.leo.combination;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RecursiveTest {

    @Test
    public void solve() {

        Integer[] data = {1, 2, 2, 4};
        List<List<Integer>> result = Recursive.solve(data, 3);
        for (List<Integer> aResult : result) {
            System.out.println(aResult);
        }
    }
}