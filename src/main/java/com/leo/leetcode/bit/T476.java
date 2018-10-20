package com.leo.leetcode.bit;

/**
 * 476. 数字的补数
 * https://leetcode-cn.com/problems/number-complement/description/
 */
public class T476 {

    public int findComplement(int num) {
        int flag = 1;
        int temp = num >> 1;
        while (temp != 0) {
            flag = (flag << 1) + 1;
            temp = temp >> 1;
        }
        return num ^ flag;
    }

}
