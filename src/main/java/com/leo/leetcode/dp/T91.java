package com.leo.leetcode.dp;

/**
 * 91. 解码方法
 * https://leetcode-cn.com/problems/decode-ways/
 */
public class T91 {

    public int numDecodings(String s) {

        if (s.length() == 0) {
            return 0;
        }

        if (((int) s.charAt(0) - '0') == 0) {
            return 0;
        }


        if (s.length() == 1) {

            return 1;
        }

        int a = 1;
        int b = 1;
        for (int i = 1; i < s.length(); i++) {
            int num = parseInt(s.charAt(i));
            int pre = parseInt(s.charAt(i - 1));
            int index = i + 1;
            int temp;
            if (num == 0) {
                if (pre != 1 && pre != 2) {
                    // 不能出现两个连续 0
                    return 0;
                }
                temp = a;
            } else if (pre == 1) {
                temp = a + b;
            } else if (pre == 2 && num <= 6) {
                temp = a + b;
            } else {
                temp = b;
            }
            a = b;
            b = temp;
        }

        return b;

    }

    private int parseInt(char c) {
        return c - '0';
    }
}
