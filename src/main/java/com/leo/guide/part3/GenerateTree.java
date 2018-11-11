package com.leo.guide.part3;

/**
 * 题目：给定一个有序数组 sortArr，已知其中没有重复值，用这个有序数组生成一棵平衡树搜索二叉树，
 * 并且该搜索树中序遍历的结果与 sortArr 一致
 */
public class GenerateTree {

    public static Node generateTree(int[] sortArr) {
        if (sortArr == null) {
            return null;
        }
        return generate(sortArr, 0, sortArr.length - 1);
    }

    private static Node generate(int[] sortArr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node head = new Node(sortArr[mid]);
        head.left = generate(sortArr, start, mid - 1);
        head.right = generate(sortArr, mid + 1, end);
        return head;
    }
}
