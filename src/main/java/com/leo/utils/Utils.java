package com.leo.utils;

/**
 * Created on 2018/3/24 上午10:31
 * leo linxiaotao1993@vip.qq.com
 */
public final class Utils {

    private Utils() {

    }

    public static boolean isEmpty(int[] data) {
        if (data == null || data.length <= 0) {
            return true;
        }
        return false;
    }

    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
