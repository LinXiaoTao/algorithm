package com.leo.leetcode.math;

/**
 * 806. 写字符串需要的行数
 * https://leetcode-cn.com/problems/number-of-lines-to-write-string/description/
 */
public class T806 {


    public int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        int total = 0;
        int line = 0;
        for (int i = 0; i < S.length(); i++) {
            total += widths[S.charAt(i) - 'a'];
            if (total == 100) {
                line++;
                total = 0;
            } else if (total > 100) {
                line++;
                total = widths[S.charAt(i) - 'a'];
            }
        }
        if (total > 0){
            line++;
        }
        result[0] = line;
        result[1] = total;
        return result;
    }

}
