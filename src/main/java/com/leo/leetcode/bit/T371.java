package com.leo.leetcode.bit;

/**
 * 371. 两整数之和
 * https://leetcode-cn.com/problems/sum-of-two-integers/description/
 */
public class T371 {

    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        // 进位
        int value = (a & b) << 1;
        return getSum(sum, value);
    }

}
