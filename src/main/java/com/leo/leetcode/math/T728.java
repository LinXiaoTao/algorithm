package com.leo.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 * https://leetcode-cn.com/problems/self-dividing-numbers/description/
 */
public class T728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i == 0) {
                continue;
            }
            if (i < 10 || isSelfDividingNumbers(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividingNumbers(int count) {
        int temp = count;
        while (temp > 0) {
            int remainder = temp % 10;
            temp /= 10;
            if (remainder == 0) {
                return false;
            }
            if (count % remainder != 0) {
                return false;
            }
        }
        return true;
    }

}
