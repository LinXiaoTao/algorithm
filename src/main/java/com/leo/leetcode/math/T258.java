package com.leo.leetcode.math;

/**
 * 258. 各位相加
 * https://leetcode-cn.com/problems/add-digits/description/
 */
public class T258 {

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        return num % 9;
    }

}
