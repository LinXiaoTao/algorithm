package com.leo.leetcode.string;

/**
 * 6. Z 字形变换
 * https://leetcode-cn.com/problems/zigzag-conversion/description/
 */
public class T6 {

    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder[] stringBuilders = new StringBuilder[Math.min(numRows,s.length())];
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        boolean flag = false;
        int row = 0;
        for (int i = 0; i < s.length(); i++) {
            stringBuilders[row].append(s,i,i + 1);
            if (row == 0 || row == numRows - 1) flag = !flag;
            row += flag ? 1 : -1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder builder : stringBuilders){
            stringBuilder.append(builder.toString());
        }
        return stringBuilder.toString();
    }

}
