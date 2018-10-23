package com.leo.leetcode.bit;

/**
 * 461. 汉明距离
 * https://leetcode-cn.com/problems/hamming-distance/description/
 */
public class T461 {

    public int hammingDistance(int x, int y) {
        int temp = x ^ y;
        int count = 0;
        while (temp != 0) {
            if ((temp & 1) == 1) {
                count++;
            }
            temp = temp >> 1;
        }
        return count;
    }

    public int hammingDistance1(int x, int y) {
        int dist = 0, n = x ^ y;
        while (n > 0) {
            ++dist;
            n &= n - 1;
        }
        return dist;
    }

}
