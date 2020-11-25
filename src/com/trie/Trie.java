package com.trie;

public class Trie {

    static class TrieNode{
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;
    }
    static final int ALPHABET_SIZE = 26;
    static TrieNode root;

    public static void insert(String key){
        int len = key.length();
        TrieNode current = root;

    }

    public static void main(String[] args) {

    }
}
