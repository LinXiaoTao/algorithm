package com.leo.structure.tree;

import com.leo.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private TreeNode<T> root;

    /**
     * 插入值
     *
     * @param value 节点值
     * @return true 表示插入成功
     */
    public boolean insert(T value) {

        TreeNode<T> preNode = null;
        TreeNode<T> nextNode = root;
        while (nextNode != null) {
            preNode = nextNode;
            if (value.compareTo(nextNode.value) > 0) {
                // 右
                nextNode = nextNode.rightNode;
            } else if (value.compareTo(nextNode.value) < 0) {
                // 左
                nextNode = nextNode.leftNode;
            } else {
                // 相同
                return false;
            }
        }
        TreeNode<T> node = new TreeNode<>(value);
        node.parentNode = preNode;
        if (preNode == null) {
            // 根节点
            root = node;
        } else {
            if (value.compareTo(preNode.value) > 0) {
                // 右
                preNode.rightNode = node;
            } else {
                // 左
                preNode.leftNode = node;
            }
        }

        return true;

    }

    /**
     * 删除指定值节点
     *
     * @param value 节点值
     * @return 返回删除的节点
     */
    public TreeNode<T> remove(T value) {
        TreeNode<T> next = root;
        while (next != null) {
            int compare = value.compareTo(next.value);
            if (compare == 0) {
                break;
            } else if (compare > 0) {
                // 右
                next = next.rightNode;
            } else {
                // 左
                next = next.leftNode;
            }
        }
        if (next != null) {

            if (next.leftNode == null && next.rightNode == null) {
                // 叶子节点，直接删除
                if (next.parentNode == null) {
                    root = null;
                } else {
                    if (next.parentNode.leftNode == next) {
                        next.parentNode.leftNode = null;
                    } else {
                        next.parentNode.rightNode = null;
                    }
                }
            } else if (next.leftNode != null && next.rightNode != null) {
                // 存在两个子节点
                // 左子节点的最大值
                TreeNode<T> leftNode = next.rightNode;
                while (leftNode.leftNode != null) {
                    leftNode = leftNode.leftNode;
                }
                // rightNode.rightNode == null
                next.value = leftNode.value;
                if (leftNode.parentNode == next) {
                    // 没有存在最大值
                    next.rightNode = leftNode.rightNode;
                } else {
                    leftNode.parentNode.leftNode = leftNode.rightNode;
                }
            } else {
                // 只存在一个子节点
                if (next.leftNode != null) {
                    if (next.parentNode == null) {
                        root = next.leftNode;
                    } else {
                        if (next.parentNode.leftNode == next) {
                            next.parentNode.leftNode = next.leftNode;
                        } else {
                            next.parentNode.rightNode = next.leftNode;
                        }
                    }
                } else {
                    if (next.parentNode == null){
                        root = next.rightNode;
                    }else {
                        if (next.parentNode.leftNode == next) {
                            next.parentNode.leftNode = next.rightNode;
                        } else {
                            next.parentNode.rightNode = next.rightNode;
                        }
                    }
                }
            }

        }

        return next;
    }

    /**
     * 查找指定值
     *
     * @param value 节点值
     * @return 节点
     */
    public TreeNode<T> search(T value) {
        TreeNode<T> next = root;
        while (next != null) {
            int compare = value.compareTo(next.value);
            if (compare == 0) {
                return next;
            } else if (compare > 0) {
                // 右
                next = next.rightNode;
            } else {
                // 左
                next = next.leftNode;
            }
        }
        return null;
    }

    /**
     * 前序遍历
     *
     * @return 遍历结果
     */
    public List<T> preOrderVisit() {
        List<T> result = new ArrayList<>();
        internalPreOrderVisit(result, root);
        return result;
    }

    /**
     * 中序遍历
     *
     * @return 遍历结果
     */
    public List<T> mediumOrderVisit() {
        List<T> result = new ArrayList<>();
        internalMediumOrderVisit(result, root);
        return result;
    }

    /**
     * 后序遍历
     *
     * @return 遍历结果
     */
    public List<T> postOrderVisit() {
        List<T> result = new ArrayList<>();
        internalPostOrderVisit(result, root);
        return result;
    }


    private void internalPreOrderVisit(List<T> result, TreeNode<T> node) {
        if (node == null) {
            return;
        }
        result.add(node.value);
        internalPreOrderVisit(result, node.leftNode);
        internalPreOrderVisit(result, node.rightNode);
    }

    private void internalMediumOrderVisit(List<T> result, TreeNode<T> node) {
        if (node == null) {
            return;
        }
        internalMediumOrderVisit(result, node.leftNode);
        result.add(node.value);
        internalMediumOrderVisit(result, node.rightNode);
    }

    private void internalPostOrderVisit(List<T> result, TreeNode<T> node) {
        if (node == null) {
            return;
        }
        internalPostOrderVisit(result, node.leftNode);
        internalPostOrderVisit(result, node.rightNode);
        result.add(node.value);
    }

}
