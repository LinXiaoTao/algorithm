package com.leo.structure;


/**
 * 树节点
 */
public class TreeNode<T extends Comparable<T>> {

    public T value;
    public TreeNode<T> parentNode;
    public TreeNode<T> leftNode;
    public TreeNode<T> rightNode;

    public TreeNode(T value) {
        this.value = value;
    }
}
