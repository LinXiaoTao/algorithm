package com.leo.leetcode.greedy;

/**
 * 860. 柠檬水找零
 * https://leetcode-cn.com/problems/lemonade-change/
 */
public class T860 {

    public boolean lemonadeChange(int[] bills) {
        if (bills.length == 0) return true;
        if (bills[0] != 5) return false;

        int fiveCount = 0;
        int tenCount = 0;

        for (int bill : bills) {

            if (bill == 5) {
                fiveCount++;
            } else if (bill == 10) {
                if (fiveCount == 0) return false;
                fiveCount--;
                tenCount++;
            } else if (bill == 20) {
                // 优先给 10
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } else if (tenCount == 0 && fiveCount > 2) {
                    fiveCount -= 3;
                } else {
                    return false;
                }
            }

        }

        return true;
    }

}
