package com.leo.combination;

import java.util.*;

/**
 * 获取所有组合情况
 * Created on 2018/3/21 下午5:16
 * leo linxiaotao1993@vip.qq.com
 */
public class Combination {

    public static void main(String[] args) {

        final int length = 5;

        final List<Integer[]> result = new ArrayList<>();

        result.add(new Integer[]{1,1,1,1,1});
        result.add(new Integer[]{0,0,0,0,0});

        for (int i = 1; i < length; i++) {
            result.addAll(getCombFlags(length, i));
        }

        //打印出所有可能出现的组合
        result.forEach(integers -> System.out.println(Arrays.toString(integers)));
    }

    private static List<Integer[]> getCombFlags(int len, int n) {

        if (n <= 0 || n >= len) {
            return Collections.emptyList();
        }

        final List<Integer[]> result = new ArrayList<>();
        final Integer[] flag = new Integer[len];
        boolean next = true;
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            flag[i] = i < n ? 1 : 0;
        }
        result.add(flag.clone());
        while (next) {
            cnt = 0;
            for (int i = 0; i < len - 1; i++) {
                if (flag[i] == 1 && flag[i + 1] == 0) {
                    for (int j = 0; j < i; j++) {
                        flag[j] = j < cnt ? 1 : 0;
                    }
                    flag[i] = 0;
                    flag[i + 1] = 1;
                    Integer[] temp = flag.clone();
                    result.add(temp);
                    if (!join("", temp).substring(len - n).contains("0")) {
                        next = false;
                    }
                    break;
                }
                if (flag[i] == 1) {
                    cnt++;
                }
            }
        }

        return result;
    }

    /**
     * Returns a string containing the tokens joined by delimiters.
     *
     * @param tokens an array objects to be joined. Strings will be formed from
     *               the objects by calling object.toString().
     */
    private static String join(CharSequence delimiter, Object[] tokens) {
        StringBuilder sb = new StringBuilder();
        boolean firstTime = true;
        for (Object token : tokens) {
            if (firstTime) {
                firstTime = false;
            } else {
                sb.append(delimiter);
            }
            sb.append(token);
        }
        return sb.toString();
    }

}
