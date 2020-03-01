package com.leo.algorithm.sort;

import com.leo.utils.Utils;

/**
 * 选择排序
 * 时间复杂度：O(n^2)
 * 在未排序序列中找到最小元素，存放到排序序列的起始位置。
 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
 * Created on 2018/3/7 下午1:08.
 * leo linxiaotao1993@vip.qq.com
 */

final class SelectSort {

    static void sort(int[] data) {

        if (Utils.isEmpty(data)) {
            return;
        }

        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            // 遍历找到最小值的下标
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            if (min != i) {
                Utils.swap(data, min, i);
            }
        }
    }

}
