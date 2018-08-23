package com.leo.guide.part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 题目：
 * 构造数组的 MaxTree
 * 要求：
 * 1. 数组必须没有重复的元素
 * 2. MaxTree 是一棵二叉树，数组中的每一个值对应一个二叉树节点
 * 3. 包括 MaxTree 数在内且在其中的每一棵子树上，值最大的节点都是树的头
 */
public class GetMaxTree {

    public static Node getMaxTree(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node[] nodes = new Node[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i]);
        }
        Stack<Node> stack = new Stack<>();
        Node head = null;
        Map<Node, Node> leftMap = new HashMap<>();
        Map<Node, Node> rightMap = new HashMap<>();

        // 每个节点左边第一个比它大的树
        for (Node node : nodes) {
            while (!stack.isEmpty() && stack.peek().value < node.value) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftMap.put(node, null);
            } else {
                leftMap.put(node, stack.peek());
            }
            stack.push(node);
        }

        while (!stack.isEmpty()){
            stack.pop();
        }

        // 每个节点右边第一个比它大的树
        for (int i = nodes.length - 1; i > -1; i--) {
            while (!stack.isEmpty() && stack.peek().value < nodes[i].value) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightMap.put(nodes[i], null);
            } else {
                rightMap.put(nodes[i], stack.peek());
            }
            stack.push(nodes[i]);
        }

        for (int i = 0; i < nodes.length; i++) {
            Node cur = nodes[i];
            Node left = leftMap.get(cur);
            Node right = rightMap.get(cur);
            if (left == null && right == null) {
                head = cur;
            } else if (left == null) {
                if (right.left == null) {
                    right.left = cur;
                } else {
                    right.right = cur;
                }
            } else if (right == null) {
                if (left.left == null) {
                    left.left = cur;
                } else {
                    left.right = cur;
                }
            } else {
                Node parent = left.value < right.value ? left : right;
                if (parent.left == null) {
                    parent.left = cur;
                } else {
                    parent.right = cur;
                }
            }
        }

        return head;
    }

    private static void popStackSetMap(Stack<Node> stack, Map<Node, Node> map) {
        Node pop = stack.pop();
        if (stack.isEmpty()) {
            map.put(pop, null);
        } else {
            map.put(pop, stack.peek());
        }
    }

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
