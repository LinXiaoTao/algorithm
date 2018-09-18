package com.leo.structure.heap;

import com.leo.structure.tree.BinaryTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 优先队列(大根堆)
 */
public class PriorityQueue<T extends Comparable<T>> {

    private final List<T> data = new ArrayList<>();

    public List<T> getData() {
        return Collections.unmodifiableList(data);
    }

    public void offer(T item) {
        data.add(item);
        if (data.size() > 1) {
            siftUp(data.size() - 1, data.get(data.size() - 1));
        }
    }


    public T poll() {
        if (data.size() == 0) {
            return null;
        } else if (data.size() == 1) {
            return data.get(0);
        }
        T result = data.get(0);
        data.set(0, data.get(data.size() - 1));
        data.remove(data.size() - 1);
        siftDown(0, data.get(0));
        return result;
    }

    public T remove(int index) {
        if (data.size() <= index) {
            return null;
        }
        if (index == (data.size() - 1)) {
            // 删除最后一个元素
            return data.remove(data.size() - 1);
        } else {
            T lastData = data.remove(data.size() - 1);
            T result = data.get(index);
            siftDown(index, lastData);
            if (data.get(index) == lastData) {
                // 下滤没有改动位置，可能需要上滤
                siftUp(index, lastData);
            }
            return result;
        }
    }

    /**
     * 下滤
     *
     * @param k 起始索引
     */
    private void siftDown(int k, T key) {
        // 忽略叶子节点 和 没有叶子节点的节点
        // k 深层有 2(k) 个节点，0-(k-1) 层共有 2(k) - 1 个节点
        int half = data.size() / 2;
        while (k < half) {
            // k 最大为 (data.size / 2) -1，所以左子节点一定存在
            // 先与左子节点相比
            int childIndex = 2 * k + 1;
            int rightIndex = childIndex + 1;
            T temp = data.get(childIndex);
            if (data.size() > rightIndex && data.get(rightIndex).compareTo(temp) > 0) {
                // 右子节点存在，并且比左子节点大
                temp = data.get(rightIndex);
                childIndex = rightIndex;
            }
            if (key.compareTo(temp) > 0) {
                break;
            }
            data.set(k, temp);
            k = childIndex;
        }
        data.set(k, key);
    }

    /**
     * 上滤
     *
     * @param k 起始索引
     */
    private void siftUp(int k, T key) {
        while (k > 0) {
            int parentIndex = (k - 1) / 2;
            if (key.compareTo(data.get(parentIndex)) <= 0) {
                break;
            }
            data.set(k, data.get(parentIndex));
            k = parentIndex;
        }
        data.set(k, key);
    }

}
