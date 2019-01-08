package com.leo.leetcode.math;

/**
 * 7. 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/description/
 */
public class T7 {

    public int reverse(int x) {
        if (x == 0) return 0;
        String numStr = String.valueOf(x);
        if (numStr.substring(0, 1).equals("-")) {
            numStr = numStr.substring(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = numStr.length() - 1; i >= 0; i--) {
            stringBuilder.append(numStr.charAt(i));
        }
        int newNum = 0;
        try {
            newNum = Integer.parseInt(stringBuilder.toString());

        } catch (NumberFormatException e) {
            newNum = 0;
        }
        if (newNum <= 0) return 0;
        if (x < 0) newNum = newNum * -1;
        return newNum;
    }

}
