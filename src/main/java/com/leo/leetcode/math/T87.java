package com.leo.leetcode.math;

/**
 * 67. 二进制求和
 * https://leetcode-cn.com/problems/add-binary/
 */
public class T87 {

    public String addBinary(String a, String b) {

        int carry = 0;

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int[] result = new int[Math.max(a.length(), b.length())];
        int index = result.length - 1;

        while (aIndex >= 0 || bIndex >= 0) {

            int aNum = 0;
            int bNum = 0;

            if (aIndex >= 0) {
                if (a.charAt(aIndex--) == '1') {
                    aNum = 1;
                }
            }

            if (bIndex >= 0) {
                if (b.charAt(bIndex--) == '1') {
                    bNum = 1;
                }
            }

            int sum = aNum + bNum + carry;
            carry = sum / 2;
            result[index--] = sum % 2;
        }


        if (carry > 0) {

            int[] newResult = new int[result.length + 1];
            newResult[0] = carry;
            for (int i = 0; i < result.length; i++) {
                newResult[i + 1] = result[i];
            }

            result = newResult;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i : result) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

}
