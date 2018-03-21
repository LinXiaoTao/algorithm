package com.leo.sort;

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

        if (data == null || data.length <= 0) {
            return;
        }


        for (int i = 0; i < data.length; i++) {

            int k = i;

            for (int j = data.length - 1; j > i; j--) {

                if (data[j] < data[k]) {
                    k = j;
                }

            }

            final int temp = data[i];
            data[i] = data[k];
            data[k] = temp;

        }

    }

}
