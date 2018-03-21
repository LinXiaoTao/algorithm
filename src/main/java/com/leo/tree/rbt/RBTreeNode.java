package com.leo.tree.rbt;


import com.leo.tree.BTreeNode;

/**
 * 红黑树节点
 * Created on 2018/3/6 上午10:46.
 * leo linxiaotao1993@vip.qq.com
 */
@SuppressWarnings("unused")
public final class RBTreeNode<T extends Comparable<T>> extends BTreeNode<T> {

    // 红/黑
    private boolean red = true;

    public RBTreeNode() {
    }

    public RBTreeNode(final T value) {
        this.value = value;
    }

    public RBTreeNode(final T value, final boolean red) {
        this.value = value;
        this.red = red;
    }


    public boolean isRed() {
        return red;
    }


    public boolean isBlack() {
        return !red;
    }

    public void makeRed() {
        red = true;
    }

    public void makeBlack() {
        red = false;
    }

//    public void setRed(final boolean red) {
//        this.red = red;
//    }

    @Override
    public RBTreeNode<T> getLeft() {
        return (RBTreeNode<T>) super.getLeft();
    }

    @Override
    public RBTreeNode<T> getRight() {
        return (RBTreeNode<T>) super.getRight();
    }

    @Override
    public RBTreeNode<T> getParent() {
        return (RBTreeNode<T>) super.getParent();
    }

    @Override
    public String toString() {
        return (red ? "R" : "B");
    }
}
