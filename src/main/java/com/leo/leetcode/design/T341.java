package com.leo.leetcode.design;

import com.leo.leetcode.builtin.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * 341. 扁平化嵌套列表迭代器
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/description/
 */
public class T341 implements Iterator<Integer> {

    private final List<Integer> stack = new ArrayList<>();
    private int index = 0;

    public T341(List<NestedInteger> nestedList) {
        for (NestedInteger val : nestedList) {
            read(val);
        }
    }

    @Override
    public boolean hasNext() {
        return stack.size() > index;
    }

    @Override
    public Integer next() {
        return stack.get(index++);
    }


    private void read(NestedInteger value) {
        if (value.isInteger()) {
            stack.add(value.getInteger());
        } else {
            for (NestedInteger val : value.getList()) {
                read(val);
            }
        }
    }

}
