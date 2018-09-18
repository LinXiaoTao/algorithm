package com.leo.structure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 二叉树
 */
public class BinaryTree<T> {

    private final List<T> data = new ArrayList<>();

    /**
     * 返回二叉树节点的数量
     *
     * @return 节点数量
     */
    public int size() {
        return (int) data.stream().filter(Objects::nonNull).count();
    }


    /**
     * 添加根节点
     *
     * @param node 根节点
     */
    public void addRootNode(T node) {
        data.add(0, node);
    }

    /**
     * 添加子节点
     *
     * @param parentIndex 父节点索引
     * @param leftNode    左子节点
     * @param rightNode   右子节点
     */
    public void addChildNode(int parentIndex, T leftNode, T rightNode) {
        addLeftNode(parentIndex, leftNode);
        addRightNode(parentIndex, rightNode);
    }

    /**
     * 添加左子节点
     *
     * @param parentIndex 父节点索引
     * @param leftNode    左子节点
     */
    public void addLeftNode(int parentIndex, T leftNode) {
        if (data.size() > parentIndex) {
            // left index
            int leftIndex = parentIndex * 2 + 1;
            for (int i = data.size(); i < leftIndex; i++) {
                data.add(null);
            }
            data.add(leftNode);
        }
    }

    /**
     * 添加右子节点
     *
     * @param parentIndex 父节点索引
     * @param rightNode   右子节点
     */
    public void addRightNode(int parentIndex, T rightNode) {
        if (data.size() > parentIndex) {
            // right index
            int rightIndex = parentIndex * 2 + 2;
            for (int i = data.size(); i < rightIndex; i++) {
                data.add(null);
            }
            data.add(rightNode);
        }
    }


    /**
     * 获取指定索引节点的值
     *
     * @param index 索引
     * @return 节点的值，如果不存在，返回 null
     */
    public T getNode(int index) {
        if (data.size() > index) {
            return data.get(index);
        }
        return null;
    }

    /**
     * 获取指定索引节点的父节点的值
     *
     * @param index 索引
     * @return 父节点的值，如果不存在，返回 null
     */
    public T getParentNode(int index) {
        // 索引奇数，表示左子节点，索引偶数，表示右子节点
        // 零表示根节点
        if (index == 0) {
            return null;
        }
        return data.get((int) Math.floor((index - 1) / 2));
    }

    /**
     * 获取指定索引节点的左子节点的值
     *
     * @param index 索引
     * @return 左子节点的值，如果不存在，返回 null
     */
    public T getLeftNode(int index) {
        // 左子节点的下标
        int leftIndex = index * 2 + 1;
        if (data.size() > leftIndex) {
            return data.get(leftIndex);
        }
        return null;
    }

    /**
     * 判断指定索引的节点是否存在左子节点
     *
     * @param index 索引
     * @return 是否存在左子节点
     */
    public boolean hasLeftNode(int index) {
        return data.size() > (index * 2 + 1);
    }

    /**
     * 获取指定索引节点的右子节点的值
     *
     * @param index 索引
     * @return 右子节点的值，如果不存在，返回 {@link Integer#MIN_VALUE}
     */
    public T getRightNode(int index) {
        // 左子节点的下标
        int rightIndex = index * 2 + 2;
        if (data.size() > rightIndex) {
            return data.get(rightIndex);
        }
        return null;
    }

    /**
     * 判断指定索引的节点是否存在右子节点
     *
     * @param index 索引
     * @return 是否存在右子节点
     */
    public boolean hasRightNode(int index) {
        return data.size() > (index * 2 + 2);
    }

    /**
     * 前序遍历二叉树，并按顺序填充进数组
     *
     * @return 访问顺序
     */
    public List<T> preOrderVisit() {
        List<T> result = new ArrayList<>(data.size());
        internalPreOrderVisit(result, 0);
        return result.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    /**
     * 中序遍历二叉树，并按顺序填充进数组
     *
     * @return 访问顺序
     */
    public List<T> mediumOrderVisit() {
        List<T> result = new ArrayList<>(data.size());
        internalMediumOrderVisit(result, 0);
        return result.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    /**
     * 后序遍历二叉树，并按顺序填充进数组
     *
     * @return 访问顺序
     */
    public List<T> postOrderVisit() {
        List<T> result = new ArrayList<>(data.size());
        internalPostOrderVisit(result, 0);
        return result.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    private void internalPreOrderVisit(List<T> arr, int index) {
        arr.add(getNode(index));
        if (hasLeftNode(index)) {
            internalPreOrderVisit(arr, index * 2 + 1);
        }
        if (hasRightNode(index)) {
            internalPreOrderVisit(arr, index * 2 + 2);
        }
    }

    private void internalMediumOrderVisit(List<T> arr, int index) {
        if (hasLeftNode(index)) {
            internalMediumOrderVisit(arr, index * 2 + 1);
        }
        arr.add(getNode(index));
        if (hasRightNode(index)) {
            internalMediumOrderVisit(arr, index * 2 + 2);
        }
    }

    private void internalPostOrderVisit(List<T> arr, int index) {
        if (hasLeftNode(index)) {
            internalPostOrderVisit(arr, index * 2 + 1);
        }
        if (hasRightNode(index)) {
            internalPostOrderVisit(arr, index * 2 + 2);
        }
        arr.add(getNode(index));
    }
}
