package com.leo.sort;

import com.leo.utils.Utils;

/**
 * 插入排序
 * 假设前 n - 1 个数已经排序好，比较第 n 个数，按顺序插入
 * 时间复杂度：O(n^2)
 * Created on 2018/3/7 下午1:35.
 * leo linxiaotao1993@vip.qq.com
 */

final class InsertSort {

    static void sort(int[] data) {

        if (Utils.isEmpty(data)) {
            return;
        }
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (data[j] < data[j - 1]) {
                    Utils.swap(data, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

}
