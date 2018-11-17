package com.leo.leetcode.bit;

/**
 * 693. 交替位二进制数
 * https://leetcode-cn.com/problems/binary-number-with-alternating-bits/description/
 */
public class T693 {

    public boolean hasAlternatingBits(int n) {
        int half = n / 2;
        int m = n;
        int flag = 1;
        while (n > 0) {
            m ^= flag;
            n = n >> 1;
            flag = flag << 1;
        }
        return m == half;
    }

}
