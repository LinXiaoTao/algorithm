package com.leo.leetcode.heap;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/top-k-frequent-elements/description/
 */
public class T347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count == null) {
                count = 0;
            }
            map.put(nums[i], ++count);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        List<Integer> heap = new ArrayList<>(k);
        for (Map.Entry<Integer, Integer> entry : entries) {
            // 构建小根堆
            if (heap.size() < k) {
                heap.add(entry.getKey());
                siftUp(heap, heap.size() - 1, entry.getKey(), map);
            } else if (entry.getValue() > map.get(heap.get(0))) {
                siftDown(heap, 0, entry.getKey(), heap.size(), map);
            }
        }
        // 堆排序
        for (int i = heap.size() - 1; i > 0; i--) {
            int temp = heap.get(i);
            heap.set(i, heap.get(0));
            siftDown(heap,0,temp,i,map);
        }
        return heap;
    }

    private void siftUp(List<Integer> keyData, int index, int key, Map<Integer, Integer> countMap) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (countMap.get(key) >= countMap.get(keyData.get(parentIndex))) {
                break;
            }
            keyData.set(index, keyData.get(parentIndex));
            index = parentIndex;
        }
        keyData.set(index, key);
    }

    private void siftDown(List<Integer> keyData, int index, int key, int len, Map<Integer, Integer> countMap) {
        while ((index * 2 + 1) < len) {
            int childIndex = index * 2 + 1;
            int rightIndex = childIndex + 1;
            if (len > rightIndex && countMap.get(keyData.get(rightIndex)) < countMap.get(keyData.get(childIndex))) {
                childIndex = rightIndex;
            }
            if (countMap.get(key) <= countMap.get(keyData.get(childIndex))) {
                break;
            }
            keyData.set(index, keyData.get(childIndex));
            index = childIndex;
        }
        keyData.set(index, key);
    }

    public List<Integer> topKFrequent1(int[] nums, int k) {

        List<Integer> result = new ArrayList<>(k);

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {

            Integer count = map.get(num);
            if(count == null){
                count = 0;
            }
            count++;
            map.put(num,count);

        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(k,new Comparator<Integer>() {

            public int compare(Integer x,Integer y){
                return map.get(x) - map.get(y);
            }

        });

        Set<Integer> keys = map.keySet();
        for(int key : keys){

            int count = map.get(key);
            if(queue.size() < k){
                queue.offer(key);
            }else if(map.get(queue.peek()) < count){
                queue.poll();
                queue.offer(key);
            }

        }

        for (int i = 0; i< k; i++){
            result.add(queue.poll());
        }

        return result;

    }
}
