package com.backtrack;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    // "aab" - > [["a", "a", "b"],["aa","b"]]
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(s, new ArrayList<>(), result, 0);
        return result;
    }
    public void dfs(String s, List<String> list, List<List<String>> result, int start){
        if(start == s.length()) result.add(new ArrayList<>(list));
        for(int i = start; i < s.length(); i++){
            if(isPalindrome(s, start, i)){
                list.add(s.substring(start, i + 1));
                dfs(s, list, result, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s, int low, int high){
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
