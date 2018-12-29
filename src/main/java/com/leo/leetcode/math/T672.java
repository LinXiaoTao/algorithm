package com.leo.leetcode.math;

/**
 * 672. 灯泡开关 Ⅱ
 * https://leetcode.com/problems/bulb-switcher-ii/discuss/107269/Java-O(1)
 * 思路：https://leetcode-cn.com/problems/bulb-switcher-ii/description/
 */
public class T672 {

    public int flipLights(int n, int m) {
        if (n == 0) return 1;
        if (m == 0) return 1;
        if (n == 1) return 2;
        if (n == 2 && m == 1) return 3;
        if (n == 2) return 4;
        if (m == 1) return 4;
        if (m == 2) return 7;
        if (m >= 3) return 8;
        return 8;
    }

}
