package com.leo.leetcode.design;

/**
 * 208. 实现 Trie (前缀树)
 * https://leetcode-cn.com/problems/implement-trie-prefix-tree/
 */
public class T208 {

    static class Trie {

        private final TrieNode root = new TrieNode();

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root.end = true;
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

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            TrieNode node = searchTrie(prefix);
            return node != null;
        }

        private TrieNode searchTrie(String prefix) {
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
        private boolean end = false;
        private TrieNode[] link = new TrieNode[26];

        TrieNode insert(char c) {
            if (contains(c)) {
                return get(c);
            }

            link[c - 'a'] = new TrieNode();
            return get(c);
        }

        boolean contains(char c) {
            return link[c - 'a'] != null;
        }

        TrieNode get(char c) {
            return link[c - 'a'];
        }
    }


}
