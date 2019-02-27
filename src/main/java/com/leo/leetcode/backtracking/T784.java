package com.leo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 784. 字母大小写全排列
 * https://leetcode-cn.com/problems/letter-case-permutation/description/
 */
public class T784 {

    public List<String> letterCasePermutation(String S) {
        if (S.length() == 0) {
            return Collections.singletonList("");
        }
        List<String> result = new ArrayList<>();
        backtracking(result,new StringBuilder(),0,S);
        return result;
    }

    public void backtracking(List<String> result, StringBuilder stringBuilder, int index, String S) {
        if (stringBuilder.length() == S.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        char item = S.charAt(index);
        if ((item >= 'a' && item <= 'z') || (item >= 'A' && item <= 'Z')) {
            // 字母

            // 小写
            stringBuilder.append(Character.toLowerCase(item));
            backtracking(result,stringBuilder,index + 1,S);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

            // 大写
            stringBuilder.append(Character.toUpperCase(item));
            backtracking(result,stringBuilder,index + 1,S);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }else {
            stringBuilder.append(item);
            backtracking(result,stringBuilder,index + 1,S);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

    }


}
