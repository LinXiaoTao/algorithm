package com.leo.leetcode.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 66. 加一
 * https://leetcode-cn.com/problems/plus-one/
 */
public class T66 {

    public int[] plusOne(int[] digits) {
        if (digits.length == 0) return new int[0];

        if (digits.length == 1 && digits[0] == 0) {
            return new int[]{1};
        }

        int[] result = null;
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + carry;
            carry = num / 10;
            digits[i] = num % 10;
        }

        if (carry > 0) {
            result = new int[digits.length + 1];
            result[0] = carry;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
        } else {
            result = digits;
        }

        return result;

    }

}
