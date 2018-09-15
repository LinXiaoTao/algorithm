package com.leo.sort;

import com.leo.utils.Utils;

/**
 * 快速排序
 * 时间复杂度：O(n * log(n))
 * 通过取第一个值作为标准，将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，则分别对这两部分继续进行排序，直到整个序列有序。
 * Created on 2018/3/7 上午11:57.
 * leo linxiaotao1993@vip.qq.com
 */

final class QuickSort {


    static void sort(int[] data) {

        if (Utils.isEmpty(data)) {
            return;
        }

        innerSort(data, 0, data.length - 1);

    }

    private static void innerSort(int[] data, int left, int right) {

        if (left < right) {
            int middle = getMiddle(data, left, right);
            innerSort(data, left, middle - 1);
            innerSort(data, middle + 1, right);
        }

    }

    /**
     * 获取中轴
     */
    private static int getMiddle(int[] data, int left, int right) {

        int temp = data[left];

        while (left < right) {

            while (left < right && data[right] > temp) right--;

            if (left < right) data[left] = data[right];

            while (left < right && data[left] <= temp) left++;

            if (left < right) data[right] = data[left];
        }

        data[left] = temp;

        return left;

    }


}
