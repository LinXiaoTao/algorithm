package com.leo.tree;

/**
 * Created on 2018/3/6 下午2:11.
 * leo linxiaotao1993@vip.qq.com
 */

public class BTreeNode<T extends Comparable<T>> {

    // value
    protected T value;
    // 左子节点
    private BTreeNode<T> left;
    // 右子节点
    private BTreeNode<T> right;
    // 父节点
    private BTreeNode<T> parent;

    public T getValue() {
        return value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

    public BTreeNode<T> getLeft() {
        return left;
    }

    public BTreeNode<T> getRight() {
        return right;
    }

    public BTreeNode<T> getParent() {
        return parent;
    }

    public void setLeft(final BTreeNode<T> left) {
        this.left = left;
    }

    public void setRight(final BTreeNode<T> right) {
        this.right = right;
    }

    public void setParent(final BTreeNode<T> parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
