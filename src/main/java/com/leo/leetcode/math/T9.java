package com.leo.leetcode.math;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/description/
 */
public class T9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        // 正数
        Deque<Integer> queue = new LinkedList<>();
        int oldValue = x;
        while (x != 0) {
            queue.addLast(x % 10);
            x = x / 10;
        }
        int value = 0;
        while (!queue.isEmpty()) {
            int v = 1;
            for (int i = 0; i < (queue.size() - 1); i++) {
                v *= 10;
            }
            value += queue.pollFirst() * v;
        }
        return value == oldValue;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        return reverse(x) == x;
    }

    private int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int a = x % 10;
            x /= 10;
            result = result * 10 + a;
        }
        return result;
    }
}
