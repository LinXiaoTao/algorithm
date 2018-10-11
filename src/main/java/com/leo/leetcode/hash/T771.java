package com.leo.leetcode.hash;

/**
 * 771. 宝石与石头
 * https://leetcode-cn.com/problems/jewels-and-stones/description/
 */
public class T771 {

    public int numJewelsInStones(String J, String S) {
        int[] hash = new int[128];
        for (int i = 0; i < J.length(); i++) {
            hash[J.charAt(i)] = 1;
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (hash[S.charAt(i)] == 1) {
                count++;
            }
        }
        return count;
    }

    public int numJewelsInStones1(String J, String S) {
        char[] s = S.toCharArray();
        int count = 0;
        for (char i : s) {
            if (J.indexOf(i) >= 0) {
                count++;
            }
        }
        return count;
    }

}
