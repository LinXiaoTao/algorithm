package com.leo.leetcode.ohter;

/**
 * https://leetcode-cn.com/problems/ugly-number/description/
 */
public class T263 {

    public boolean isUgly(int num) {

        if (num <= 0){
            return false;
        }

        while (num > 0) {

            if (num == 1) {
                return true;
            }

            if (num % 2 == 0) {
                num /= 2;
                continue;
            }
            if (num % 3 == 0) {
                num /= 3;
                continue;
            }
            if (num % 5 == 0) {
                num /= 5;
                continue;
            }
            return false;
        }

        return true;
    }

}
