package com.leo.tree.rbt;


import com.sun.istack.internal.Nullable;

import javax.validation.constraints.NotNull;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created on 2018/3/6 上午10:50.
 * leo linxiaotao1993@vip.qq.com
 */
@SuppressWarnings("unused")
public final class RBTree<T extends Comparable<T>> {

    // 根节点
    private RBTreeNode<T> root;
    // 节点数量
    private AtomicLong size = new AtomicLong(0);
    // overrideMode 为 true 时，新的节点值可以覆盖旧的节点值
    private volatile boolean overrideMode = true;

    public RBTree() {
    }

    public boolean isOverrideMode() {
        return overrideMode;
    }

    public void setOverrideMode(final boolean overrideMode) {
        this.overrideMode = overrideMode;
    }

    public AtomicLong getSize() {
        return size;
    }

    public RBTreeNode<T> getRoot() {
        return root;
    }

    /**
     * 添加 value 到新节点
     *
     * @param value value
     */
    public void insertNode(T value) {

        if (value == null) {
            throw new IllegalArgumentException("node not null!");
        }

        insertNode(new RBTreeNode<>(value));
    }

    public void deleteNode(T value) {

        if (value == null) {
            throw new IllegalArgumentException("node not null!");
        }

        if (root == null) {
            return;
        }

        deleteNode(root, value);

    }

    private void insertNode(@NotNull RBTreeNode<T> node) {

        node.setLeft(null);
        node.setRight(null);
        node.makeRed();

        final RBTreeNode<T> parent = findParentNode(node);

        if (parent != null) {
            int cmp = parent.getValue().compareTo(node.getValue());

            if (cmp == 0) {
                if (!overrideMode) {
                    // 不允许覆盖相同值的节点
                    return;
                }

                // 覆盖为新的值
                parent.setValue(node.getValue());
                return;
            }


            if (cmp > 0) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }

        node.setParent(parent);

        size.incrementAndGet();

        if (root == null) {
            root = node;
        }

        insert_case1(node);
    }


    /**
     * 情形1：新节点位于树的根上
     *
     * @param node 节点
     */
    private void insert_case1(@NotNull RBTreeNode<T> node) {

        if (node.getParent() == null) {
            //根节点为黑色
            root.makeBlack();
        } else {
            insert_case2(node);
        }
    }


    /**
     * 情形2：新节点的父节点是黑色
     *
     * @param node 节点
     */
    private void insert_case2(@NotNull RBTreeNode<T> node) {

        if (!node.getParent().isRed()) {
            return;
        } else {
            insert_case3(node);
        }

    }

    /**
     * 情形3：父节点和叔父节点都是红色
     *
     * @param node 节点
     */
    private void insert_case3(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> uncleNode = getUncleNode(node);
        final RBTreeNode<T> grandParentNode = getGrandParentNode(node);

        if (grandParentNode != null && uncleNode != null && uncleNode.isRed()) {
            // 父节点和叔父节点都绘制为黑色
            node.getParent().makeBlack();
            uncleNode.makeBlack();

            //祖父节点设置为红色
            grandParentNode.makeRed();

            insert_case1(grandParentNode);

        } else {

            insert_case4(node);

        }

    }

    /**
     * 情形4：父节点是红色，而叔父节点是黑色或者不存在，并且新节点是其父节点的右/左子节点，同时其父节点又是祖父节点的左/右子节点
     *
     * @param node 节点
     */
    private void insert_case4(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> grandParentNode = getGrandParentNode(node);
        if (grandParentNode == null) {
            return;
        }

        if (node == node.getParent().getRight() && node.getParent() == grandParentNode.getLeft()) {
            // 以父节点为支点，左旋
            leftRotate(node.getParent());
            node = node.getLeft();
        } else if (node == node.getParent().getLeft() && node.getParent() == grandParentNode.getRight()) {
            // 以父节点为支点，右旋
            rightRotate(node.getParent());
            node = node.getRight();
        }

        insert_case5(node);

    }

    /**
     * 情形5：父节点是红色，而叔父节点是黑色或缺少，并且新节点是其父节点的左/右子节点，同时其父节点又是祖父节点的左/右子节点
     *
     * @param node 节点
     */
    private void insert_case5(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> parentNode = node.getParent();
        final RBTreeNode<T> grandParentNode = getGrandParentNode(node);

        if (grandParentNode == null) {
            return;
        }

        // 父节点绘制为黑色
        parentNode.makeBlack();
        // 祖父节点绘制为红色
        grandParentNode.makeRed();

        if (node == parentNode.getLeft() && parentNode == grandParentNode.getLeft()) {
            rightRotate(grandParentNode);
        } else {
            leftRotate(grandParentNode);
        }

    }


    private void deleteNode(@NotNull RBTreeNode<T> node, T data) {

        int cmp = node.getValue().compareTo(data);

        if (cmp > 0) {
            if (node.getLeft() == null) {
                return;
            }
            deleteNode(node.getLeft(), data);
        } else if (cmp < 0) {
            if (node.getRight() == null) {
                return;
            }
            deleteNode(node.getRight(), data);
        } else {
            // 搜索到要删除的节点
            // 选择右子节点的最小值节点进行交换，也可以选择左子节点的最大值节点进行操作
            if (node.getRight() == null) {
                // 当前节点就是最小值节点
                realDeleteNode(node);
                return;
            }

            final RBTreeNode<T> smallest = getSmallestChild(node.getRight());
            node.setValue(smallest.getValue());
            realDeleteNode(smallest);
        }


    }

    private RBTreeNode<T> getSmallestChild(@NotNull RBTreeNode<T> node) {

        if (node.getLeft() == null) {
            return node;
        }
        return getSmallestChild(node.getLeft());

    }

    /**
     * 根据前面的判断，在这个方法中，操作的节点只会有一个子节点
     *
     * @param node 节点
     */
    private void realDeleteNode(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> child = node.getLeft() == null ? node.getRight() : node.getLeft();

        if (node.getParent() == null && node.getLeft() == null && node.getRight() == null) {
            // 根节点，并且没有任何子节点
            root = null;
            return;
        }

        if (node.getParent() == null) {
            // 根节点，存在一个子节点，直接将子节点作为根节点，并绘制为黑色
            root = child;
            root.setParent(null);
            root.makeBlack();
            return;
        }

        // 删除节点
        if (node.getParent().getLeft() == node) {
            node.getParent().setLeft(child);
        } else {
            node.getParent().setRight(child);
        }
        child.setParent(node.getParent());

        if (!node.isRed()) {
            // 如果删除黑色节点，不会有影响
            if (child.isRed()) {
                // 如果删除一个黑色节点，而当前子节点为红色，则设置当前子节点为黑色
                child.makeBlack();
            } else {
                // 接下来所有的操作都是基于要删除的节点和它的子节点都是黑色
                deleteCase1(child);
            }
        }
    }


    /**
     * 情形1：节点是根节点
     *
     * @param node 节点
     */
    private void deleteCase1(@NotNull RBTreeNode<T> node) {
        if (node.getParent() != null) {
            deleteCase2(node);
        }
    }

    /**
     * 情形2：兄弟节点是红色
     *
     * @param node 节点
     */
    private void deleteCase2(@NotNull RBTreeNode<T> node) {

        // FIXME: 2018/3/6 是否需要判断兄弟节点为 null 情况
        final RBTreeNode<T> sibling = getSiblingNode(node);

        if (sibling.isRed()) {

            node.getParent().makeRed();
            sibling.makeBlack();
            // 以父节点为支点进行左旋或者右旋
            if (node == node.getParent().getLeft()) {
                leftRotate(node.getParent());
            } else {
                rightRotate(node.getParent());
            }
        }


        deleteCase3(node);
    }

    /**
     * 情形3：父节点、兄弟节点、兄弟节点的子节点都是黑色的
     *
     * @param node 节点
     */
    private void deleteCase3(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> sibling = getSiblingNode(node);

        // FIXME: 2018/3/6 是否需要判断兄弟节点为 null 情况，同时存在两个子节点
        if (node.getParent().isBlack() && sibling.isBlack() && sibling.getLeft().isBlack() && sibling.getRight().isBlack()) {
            // 简单将兄弟节点绘制为红色的
            sibling.makeRed();
            deleteCase1(node.getParent());
        } else {
            deleteCase4(node);
        }
    }

    /**
     * 情形4：父节点是红色的，兄弟节点以及兄弟节点都是黑色的
     *
     * @param node 节点
     */
    private void deleteCase4(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> sibling = getSiblingNode(node);

        // FIXME: 2018/3/6 是否需要判断兄弟节点为 null 情况，同时存在两个子节点

        if (node.getParent().isRed() && sibling.isBlack() && sibling.getLeft().isBlack() && sibling.getRight().isBlack()) {
            // 交换兄弟节点和父节点的颜色
            sibling.makeRed();
            node.getParent().makeBlack();
        }

    }

    /**
     * 情形5：兄弟节点是黑色的，兄弟节点的右/左子节点是黑色的，而当前节点是它父亲的左/右子节点
     *
     * @param node 节点
     */
    private void deleteCase5(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> sibling = getSiblingNode(node);

        // FIXME: 2018/3/6 是否需要判断兄弟节点为 null 情况，同时存在两个子节点

        if (sibling.isBlack()) {
            if (node == node.getParent().getLeft() && sibling.getRight().isBlack() && sibling.getLeft().isRed()) {
                // 以兄弟节点为支点做右旋转，接着交换兄弟节点和它的新父节点的颜色
                rightRotate(sibling);
                sibling.makeRed();
                sibling.getParent().makeBlack();
            } else if (node == node.getParent().getRight() && sibling.getRight().isRed() && sibling.getLeft().isBlack()) {
                // 以兄弟节点为支点做左旋转，接着交换兄弟节点和它的新父节点的颜色
                leftRotate(sibling);
                sibling.makeRed();
                sibling.getParent().makeBlack();
            }
        }

        deleteCase6(node);

    }

    /**
     * 情形6：兄弟节点是黑色，兄弟节点的右/左子节点是红色的，而当前节点是其父节点的左/右子节点
     *
     * @param node 节点
     */
    private void deleteCase6(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> sibling = getSiblingNode(node);

        // 交换当前节点的父节点和兄弟节点的颜色
        if (node.getParent().isBlack()) {
            sibling.makeBlack();
        } else {
            sibling.makeRed();
        }

        node.getParent().makeBlack();

        if (node == node.getParent().getLeft()) {
            sibling.getRight().makeBlack();
            leftRotate(node.getParent());
        } else {
            sibling.getLeft().makeBlack();
            rightRotate(node.getParent());
        }

    }

    /**
     * 寻找新节点合适的父节点
     *
     * @param node 节点
     * @return 父节点
     */
    private RBTreeNode<T> findParentNode(RBTreeNode<T> node) {

        RBTreeNode<T> findParent = root;
        RBTreeNode<T> child = root;

        while (child != null) {

            int cmp = child.getValue().compareTo(node.getValue());
            if (cmp == 0) {
                //相等情况
                return child;
            }
            if (cmp > 0) {

                findParent = child;
                child = findParent.getLeft();

            } else {

                findParent = child;
                child = child.getRight();

            }
        }

        return findParent;

    }

    /**
     * 获取叔父节点
     *
     * @param node 节点
     * @return 叔父节点
     */
    @Nullable
    private RBTreeNode<T> getUncleNode(RBTreeNode<T> node) {


        // 祖父节点
        final RBTreeNode<T> grandParent = getGrandParentNode(node);

        if (grandParent == null) {
            return null;
        }

        if (node.getParent() == grandParent.getLeft()) {
            return grandParent.getRight();
        } else {
            return grandParent.getLeft();
        }

    }

    /**
     * 获取祖父节点
     *
     * @param node 节点
     * @return 祖父节点
     */
    @Nullable
    private RBTreeNode<T> getGrandParentNode(RBTreeNode<T> node) {

        if (node.getParent() == null) {
            return null;
        }

        return node.getParent().getParent();

    }

    /**
     * 获取兄弟节点
     *
     * @param node 节点
     * @return 兄弟节点
     */
    @Nullable
    private RBTreeNode<T> getSiblingNode(RBTreeNode<T> node) {

        if (node.getParent() == null) {
            return null;
        }

        if (node == node.getParent().getLeft()) {
            return node.getParent().getRight();
        } else {
            return node.getParent().getLeft();
        }

    }

    /**
     * 左旋
     *
     * @param node 支点节点
     */
    private void leftRotate(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> right = node.getRight();
        if (right == null) {
            throw new IllegalArgumentException("right node not null!");
        }

        final RBTreeNode<T> parent = node.getParent();
        if (parent == null) {
            // 支点节点是根节点，那么旋转后，原来的子节点应该为新的根节点
            root = right;
        } else {
            if (parent.getLeft() == node) {
                parent.setLeft(right);
            } else {
                parent.setRight(right);

            }
        }

        node.setRight(right.getLeft());
        if (right.getLeft() != null) {
            right.getLeft().setParent(node);
        }

        right.setLeft(node);
        node.setParent(right);

        right.setParent(parent);

    }


    /**
     * 右旋
     *
     * @param node 支点节点
     */
    private void rightRotate(@NotNull RBTreeNode<T> node) {

        final RBTreeNode<T> left = node.getLeft();
        if (left == null) {
            throw new IllegalArgumentException("left node not null!");
        }

        final RBTreeNode<T> parent = node.getParent();
        if (parent == null) {
            // 支点节点是根节点，那么旋转后，原来的子节点应该为新的根节点
            root = left;
        } else {
            if (parent.getLeft() == node) {
                parent.setLeft(left);
            } else {
                parent.setRight(left);
            }
        }

        node.setLeft(left.getRight());
        if (left.getRight() != null) {
            left.getRight().setParent(node);
        }

        left.setRight(node);
        node.setParent(left);

        left.setParent(parent);

    }


}

