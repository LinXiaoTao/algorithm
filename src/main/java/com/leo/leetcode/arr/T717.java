package com.leo.leetcode.arr;

/**
 * 717. 1比特与2比特字符
 * https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/description/
 */
public class T717 {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        boolean result = true;
        while (i < bits.length) {
            // 0 10 11
            if (bits[i] == 0) {
                i++;
                result = true;
            } else {
                i += 2;
                result = false;
            }
        }
        return result;
    }

    public boolean isOneBitCharacter1(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

}
