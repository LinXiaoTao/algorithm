package com.leo.guide.part1;


import java.util.Stack;

/**
 * 题目：
 * 汉诺塔问题
 * 要求：
 * 限制不能从最左侧的塔直接移动到最右侧，也不能从最右侧直接移动到最左侧
 */
public class HanoiProblem {

    public enum Tower {

        LEFT("left"),

        MID("mid"),

        RIGHT("right");

        private String name;

        Tower(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /**
     * 递归实现
     *
     * @param num  总共移动的层
     * @param from 起点
     * @param to   终点
     * @return 移动的步数
     */
    public static int recursive(int num, Tower from, Tower to) {
        if (num == 0 || from == to) {
            return 0;
        }
        return process(num, from, to);
    }

    /**
     * 实现栈实现
     *
     * @param num  总共移动的层
     * @param from 起点
     * @param to   终点
     * @return 移动的步数
     */
    public static int stack(int num, Tower from, Tower to) {
        if (num == 0 || from == to) {
            return 0;
        }
        // 存在三个塔，所以每次移动只会出现四种结果：
        // 1. 左移动到中
        // 2. 中移动到左
        // 3. 中移动到右
        // 4. 右移动到中
        // 只要我们满足以下条件，这次移动就是正确的
        // 1. 当前移动不能和上次移动是互斥的，即比如上一次是 left - mid，那这一次不能是 mid - left
        // 2. 移动要符合规则，即大的数不能在小的数上面
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();
        Stack<Integer> midStack = new Stack<>();
        leftStack.push(Integer.MAX_VALUE);
        rightStack.push(Integer.MAX_VALUE);
        midStack.push(Integer.MAX_VALUE);
        Stack<Integer> toStack = null;
        Stack<Integer> fromStack = null;
        int count = 0;
        switch (from) {
            case LEFT:
                fromStack = leftStack;
                break;
            case MID:
                fromStack = midStack;
                break;
            case RIGHT:
                fromStack = rightStack;
                break;
        }
        switch (to) {
            case LEFT:
                toStack = leftStack;
                break;
            case MID:
                toStack = midStack;
                break;
            case RIGHT:
                toStack = rightStack;
                break;
        }
        for (int i = num; i > 0; i--) {
            fromStack.push(i);
        }
        Change preChange = null;
        while (toStack.size() != (num + 1)) {

            // 四种操作

            // 1. 左移动到中
            if (preChange != Change.MID_TO_LEFT && leftStack.peek() < midStack.peek()) {
                midStack.push(leftStack.pop());
                preChange = Change.LEFT_TO_MID;
                count++;
            }

            // 2. 中移动到左
            if (preChange != Change.LEFT_TO_MID && midStack.peek() < leftStack.peek()) {
                leftStack.push(midStack.pop());
                preChange = Change.MID_TO_LEFT;
                count++;
            }

            // 3. 中移动到右
            if (preChange != Change.RIGHT_TO_MID && midStack.peek() < rightStack.peek()) {
                rightStack.push(midStack.pop());
                preChange = Change.MID_TO_RIGHT;
                count++;
            }

            // 4. 右移动到中
            if (preChange != Change.MID_TO_RIGHT && rightStack.peek() < midStack.peek()) {
                midStack.push(rightStack.pop());
                preChange = Change.RIGHT_TO_MID;
                count++;
            }

        }

        return count;
    }

    private enum Change {
        // 左移动到中
        LEFT_TO_MID,
        // 中移动到左
        MID_TO_LEFT,
        // 中移动右
        MID_TO_RIGHT,
        // 右移动到中
        RIGHT_TO_MID
    }

    /**
     * 递归移动
     *
     * @param num  当前移动层
     * @param from 起点
     * @param to   终点
     * @return 移动的步数
     */
    private static int process(int num, Tower from, Tower to) {
        if (num == 1) {
            // 当起点塔只有一层时，从一边移动到另外一边，需要两步，比如：left -> mid，mid -> right
            // 如果其中一个在中间，则需要一步，比如：mid -> right
            if (from == Tower.MID || to == Tower.MID) {
                log(1, from, to);
                return 1;
            } else {
                log(1, from, Tower.MID);
                log(1, Tower.MID, to);
                return 2;
            }
        } else {
            if (from == Tower.MID || to == Tower.MID) {
                // 如果起点塔为中塔或者目的塔为中塔，则总共需要三步处理，比如 left -> mid
                // 1. 将 num - 1 层全部移动到 right（递归处理）
                // 2. 将第 num 层移动到 mid
                // 3. 将 num - 1 层移动到 mid
                Tower another = (from == Tower.LEFT || to == Tower.LEFT) ? Tower.RIGHT : Tower.LEFT;
                int count = process(num - 1, from, another);
                log(num, from, to);
                count++;
                count += process(num - 1, another, to);
                return count;
            } else {
                // 否则，需要五步，比如 left -> right
                // 1. 将 num - 1 层全部移动到 right (递归)
                // 2. 将第 num 层移动到 mid
                // 3. 将 num - 1 层全部移动到 left (递归)
                // 4. 将第 num 层移动到 right
                // 5. 将 num - 1 层全部移动到 right (递归)
                int count = process(num - 1, from, to);
                log(num, from, Tower.MID);
                count++;
                count += process(num - 1, to, from);
                log(num, Tower.MID, to);
                count++;
                count += process(num - 1, from, to);
                return count;
            }
        }
    }

    private static void log(int num, Tower from, Tower to) {
        System.out.println("第 " + num + " 个从 " + from + " 移动到 " + to);
    }

}
