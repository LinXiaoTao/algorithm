package com.leo.leetcode.math;

/**
 * 171. Excel表列序号
 * https://leetcode-cn.com/problems/excel-sheet-column-number/description/
 */
public class T171 {

    public int titleToNumber(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            result += (s.charAt(i) - 'A' + 1) * Math.pow(26, (s.length() - 1 - i));
        }
        result += (s.charAt(s.length() - 1) - 'A' + 1);
        return result;
    }

}
