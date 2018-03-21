package com.leo.sort;

/**
 * 选择排序
 * 时间复杂度：O(n^2)
 * Created on 2018/3/7 下午1:35.
 * leo linxiaotao1993@vip.qq.com
 */

final class InsertSort {


    static void sort(int[] data) {

        if (data == null || data.length <= 0) {
            return;
        }

        for (int i = 0; i < data.length; i++) {

            // 选择一个元素
            final int temp = data[i];
            int j;
            for (j = i; j > 0 && temp < data[j - 1]; j--) {
                // 与前一位置的元素进行比较，比当前元素大于或等于，向后移动
                data[j] = data[j - 1];
            }

            //直到前一位置元素比当前元素小，插入在当前移动到的位置
            data[j] = temp;
        }


    }

}
