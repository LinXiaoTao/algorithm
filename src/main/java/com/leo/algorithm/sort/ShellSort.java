package com.leo.algorithm.sort;

import com.leo.utils.Utils;

/**
 * 希尔排序
 * 时间复杂度：O(n log2(n))
 * Created on 2018/3/24 上午11:03
 * leo linxiaotao1993@vip.qq.com
 */
// TODO: 2018/3/24
final class ShellSort {

    static void sort(int[] data) {

        if (Utils.isEmpty(data)) {
            return;
        }

        int incre = data.length;

        while (true) {

            incre = incre / 2;

            for (int i = 0; i < incre; i++) {

                for (int j = i + incre; j < data.length; j += incre) {

                    for (int k = j; k > i; k -= incre) {
                        if (data[k] < data[k - incre]) {
                            Utils.swap(data, k, k - incre);
                        } else {
                            break;
                        }
                    }

                }

            }

            if (incre == 1) {
                break;
            }

        }

    }

}
