package com.leo.leetcode.design;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 212. 单词搜索 II
 * https://leetcode-cn.com/problems/word-search-ii/
 */
public class T212 {

    public List<String> findWords(char[][] board, String[] words) {

        Trie trie = new Trie();
        Set<String> result = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i]);
        }

        boolean[][] vis = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                vis[i][j] = true;
                find(vis, trie, result, new StringBuilder(), board, i, j);
                vis[i][j] = false;
            }
        }


        return new ArrayList<>(result);

    }

    private void find(boolean[][] vis, Trie trie, Set<String> result, StringBuilder builder, char[][] board, int i, int j) {

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length) {
            return;
        }


        builder.append(board[i][j]);


        if (trie.search(builder.toString())) {
            result.add(builder.toString());
        }

        if (trie.searchTrie(builder.toString()) == null) {
            builder.delete(builder.toString().length() - 1, builder.toString().length());
            return;
        }


        if ((i - 1) >= 0 && !vis[i - 1][j]) {
            vis[i - 1][j] = true;
            find(vis, trie, result, builder, board, i - 1, j);
            vis[i - 1][j] = false;
        }

        if (i + 1 < board.length && !vis[i + 1][j]) {
            vis[i + 1][j] = true;
            find(vis, trie, result, builder, board, i + 1, j);
            vis[i + 1][j] = false;
        }


        if ((j - 1) >= 0 && !vis[i][j - 1]) {
            vis[i][j - 1] = true;
            find(vis, trie, result, builder, board, i, j - 1);
            vis[i][j - 1] = false;
        }

        if (j + 1 < board[0].length && !vis[i][j + 1]) {
            vis[i][j + 1] = true;
            find(vis, trie, result, builder, board, i, j + 1);
            vis[i][j + 1] = false;
        }


        builder.delete(builder.toString().length() - 1, builder.toString().length());

    }


    private static class Trie {
        private final TrieNode root = new TrieNode();

        /**
         * Initialize your data structure here.
         */
        Trie() {
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {

            TrieNode next = root;
            for (int i = 0; i < word.length(); i++) {
                next = next.insert(word.charAt(i));
            }
            next.end = true;

        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            TrieNode node = searchTrie(word);
            return node != null && node.end;

        }

        TrieNode searchTrie(String prefix) {
            if (prefix.length() == 0) {
                return root;
            }

            TrieNode next = root;
            for (int i = 0; i < prefix.length(); i++) {
                next = next.get(prefix.charAt(i));
                if (next == null) break;
            }

            return next;
        }


    }

    private static class TrieNode {
        private boolean end;
        private TrieNode[] link = new TrieNode[26];

        private boolean contains(char c) {
            return link[c - 'a'] != null;
        }

        private TrieNode get(char c) {
            return link[c - 'a'];
        }

        private TrieNode insert(char c) {
            if (contains(c)) {
                return get(c);
            }

            link[c - 'a'] = new TrieNode();
            return get(c);

        }

    }

}
