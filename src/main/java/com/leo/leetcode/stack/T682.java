package com.leo.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * 682. 棒球比赛
 * https://leetcode-cn.com/problems/baseball-game/description/
 */
public class T682 {

    public int calPoints(String[] ops) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];
            if (op.equals("+")) {
                if (result.size() > 1) {
                    result.add(
                            result.get(result.size() - 1) + result.get(result.size() - 2)
                    );
                }
            } else if (op.equals("D")) {
                if (!result.isEmpty()) {
                    result.add(result.get(result.size() - 1) * 2);
                }
            } else if (op.equals("C")) {
                if (!result.isEmpty()) {
                    result.remove(result.size() - 1);
                }
            } else {
                try {
                    result.add(Integer.parseInt(op));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return result.stream().reduce(0, (integer, integer2) -> integer + integer2);
    }


    public int calPoints1(String[] ops) {
        int[] nums = new int[ops.length];
        int sum = 0;
        int index = 0;
        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];
            if (op.equals("+")) {
                if (index > 1) {
                    nums[index] = nums[index - 1] + nums[index - 2];
                    sum += nums[index];
                    index++;
                }
            } else if (op.equals("D")) {
                if (index > 0) {
                    nums[index] = nums[index - 1] * 2;
                    sum += nums[index];
                    index++;
                }
            } else if (op.equals("C")) {
                if (index > 0) {
                    sum -= nums[index - 1];
                    nums[index - 1] = 0;
                    index--;
                }
            } else if (ops[i].charAt(0) >= '0' && ops[i].charAt(0) <= '9' || ops[i].charAt(0) == '-') {
                nums[index] = Integer.parseInt(ops[i]);
                sum += nums[index];
                index++;
            }
        }
        return sum;
    }


}
