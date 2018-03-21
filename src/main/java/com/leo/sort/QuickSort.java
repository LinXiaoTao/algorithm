package com.leo.sort;

/**
 * 快速排序
 * 时间复杂度：O(n log(n))
 * 通过取第一个值作为标准，将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，则分别对这两部分继续进行排序，直到整个序列有序。
 * Created on 2018/3/7 上午11:57.
 * leo linxiaotao1993@vip.qq.com
 */

final class QuickSort {


    static void sort(int[] data) {

        if (data == null || data.length <= 0) {
            return;
        }

        innerSort(data, 0, data.length - 1);

    }

    private static void innerSort(int[] data, int low, int high) {

        if (low < high) {

            int middle = getMiddle(data, low, high);
            innerSort(data, low, middle - 1);
            innerSort(data, middle + 1, high);

        }

    }

    /**
     * 获取中轴
     */
    private static int getMiddle(int[] data, int low, int high) {

        int temp = data[low];
        while (low < high) {

            while (low < high && data[high] >= temp) {
                high--;
            }

            data[low] = data[high];

            while (low < high && data[low] < temp) {
                low++;
            }


            data[high] = data[low];

        }

        data[low] = temp;

        return low;

    }


}
