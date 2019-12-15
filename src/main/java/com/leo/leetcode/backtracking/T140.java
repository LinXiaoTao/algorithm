package com.leo.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 140. 单词拆分 II
 * https://leetcode-cn.com/problems/word-break-ii/
 */
public class T140 {

    public List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreakHelper(s,wordDict,0,new HashMap<>());
    }

    private List<String> wordBreakHelper(String s, List<String> wordDict, int start, Map<Integer,List<String>> cache){

        if(start == s.length()) {
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        if(cache.containsKey(start)){
            return cache.get(start);
        }

        List<String> res = new ArrayList<>();

        for(int i = start;i < s.length(); i++){

            if(!wordDict.contains(s.substring(start,i + 1))) continue;

            for(String item : wordBreakHelper(s,wordDict,i + 1,cache)) {
                res.add(s.substring(start,i + 1) +   (item.equals("") ? "" : " ") + item);
            }

        }

        cache.put(start,res);

        return res;
    }

}
