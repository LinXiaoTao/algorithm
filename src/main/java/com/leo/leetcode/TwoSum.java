package com.leo.leetcode;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[nums.length];
        // 过滤不可能的数
        int index = 0;
        for(int value : nums) {
            if(value > target) {
                continue;
            }
            temp[index] = value;
        }
        // 快排
        quickSort(temp);
        for (int i = 0; i < temp.length; i++) {
            int value = temp[i];
            int searchIndex = binarySearch(temp,i,target - value);
            if(searchIndex > -1) {
                return new int[] {value,temp[searchIndex]};
            }
        }
        return new int[2];
    }

    private void quickSort(int[] nums) {
        if(nums.length == 0){
            return;
        }
        sort(nums,0,nums.length - 1);

    }

    private void sort(int[] nums,int start,int end) {
        while (start < end) {
            int mid = getMid(nums,start,end);
            sort(nums,start,mid - 1);
            sort(nums,mid + 1,end);
        }
    }

    private int getMid(int[] nums,int start,int end) {
        int temp = nums[start];
        while (start < end) {
            while (start < end && nums[end] >= temp) {
                end--;
            }
            nums[start] =  nums[end];
            while (start < end && nums[start] < temp) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = temp;
        return start;
    }

    private int binarySearch(int[] nums,int start,int target) {
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            int midVal = nums[mid];
            if (target > midVal) {
                start = mid + 1;
            } else if(target < midVal) {
                end = mid - 1;
            } else {
                // find
                return mid;
            }
        }
        // not find
        return -1;
    }

}
