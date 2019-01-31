package com.leo.leetcode.string;

/**
 * 8. 字符串转换整数 (atoi)
 * https://leetcode-cn.com/problems/string-to-integer-atoi/description/
 */
public class T8 {


    public int myAtoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        // 判断是否有效
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == '-' || str.charAt(0) == '+' || (str.charAt(0) <= '9' && str.charAt(0) >= '0')) {
            int flag = 1;
            if (str.charAt(0) == '-' || str.charAt(0) == '+') {
                if (str.charAt(0) == '-') {
                    flag *= -1;
                }
                // 删除符号位
                str = str.substring(1);
            }
            if (str.length() == 0) {
                return 0;
            }
            int endIndex = 0;
            while (endIndex < str.length()) {
                // 获取数字下标
                if (str.charAt(endIndex) <= '9' && str.charAt(endIndex) >= '0') {
                    // 数字
                    endIndex++;
                } else {
                    break;
                }
            }
            String numberStr = str.substring(0, endIndex);
            System.out.println("numberStr: " + numberStr);
            long result = 0;
            for (int i = numberStr.length() - 1; i >= 0; i--) {
                result += Math.pow(10, numberStr.length() - 1 - i) * Integer.parseInt(numberStr.substring(i, i + 1));
                if (result > Integer.MAX_VALUE) {
                    return (flag > 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            return (int) (result * flag);
        } else {
            return 0;
        }

    }

    public int myAtoi1(String s) {
        int state = 0;
        long sum = 0;
        boolean isPositive = true;
        for (int index = 0; index < s.length(); index++) {
            final char current = s.charAt(index);
            switch (state) {
                case 0:
                    if (current == '-') {
                        isPositive = false;
                        state = 1;
                    } else if (current == '+') {
                        state = 1;
                    } else if (current >= '0' && current <= '9') {
                        state = 1;
                        index = index - 1;
                    } else if (current == ' ') {
                        continue;
                    } else {
                        return 0;
                    }
                    break;
                case 1:
                    if (current >= '0' && current <= '9') {
                        sum = sum * 10 + (current - '0');
                        if (isPositive && sum >= Integer.MAX_VALUE) {
                            sum = Integer.MAX_VALUE;
                            return ((int) sum);
                        } else if (!isPositive && sum * -1 <= Integer.MIN_VALUE) {
                            sum = Integer.MIN_VALUE;
                            return ((int) sum);
                        }
                    } else {
                        if (!isPositive) {
                            sum = sum * -1;
                        }
                        return ((int) sum);
                    }
                    break;
            }
        }
        if (!isPositive) {
            sum = sum * -1;
        }
        return ((int) sum);
    }

}
