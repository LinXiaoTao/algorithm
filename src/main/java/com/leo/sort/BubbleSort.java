package com.leo.sort;

import com.leo.utils.Utils;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * Created on 2018/3/7 上午11:26.
 * leo linxiaotao1993@vip.qq.com
 */

final class BubbleSort {


    static void sort(int[] data) {

        if (Utils.isEmpty(data)) {
            return;
        }

        // 是否发生交换
        boolean swap;

        // 最多循环次数 (length - 1) 次
        for (int i = 0; i < data.length - 1; i++) {
            swap = false;
            for (int j = 0; j < (data.length - 1 - i); j++) {
                // 将较小的元素慢慢排列到前端
                // 最后面的元素就是最大的
                if (data[j] > data[j + 1]) {
                    Utils.swap(data, j, j + 1);
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
    }


}
