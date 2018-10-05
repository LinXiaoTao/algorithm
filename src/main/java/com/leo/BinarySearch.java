package com.leo;

/**
 * 二分查找法
 */
public class BinarySearch {

    /**
     * 查找指定元素
     *
     * @param nums  已排序好的数据
     * @param start 起始
     * @param end   结束
     * @param key   指定元素
     * @return 在数据中的下标，-1 表示不存在
     */
    public static int search(int[] nums, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > key) {
                end = mid - 1;
            } else if (nums[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
