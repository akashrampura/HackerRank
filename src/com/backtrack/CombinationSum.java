package com.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list =  new ArrayList<>();
        int sum = 0;
        Arrays.sort(candidates);
        dfs(candidates, 0,  target, list, result);
        System.out.println(result);
        return result;
    }
    public void dfs(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> result){
        if(target < 0) return;
        if(target == 0) result.add(new ArrayList<>(list));
        for(int i = start; i < candidates.length; i++){
            list.add(candidates[i]);
            dfs(candidates, i ,target - candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum  cs = new CombinationSum();
        cs.combinationSum(new int[]{2,3,6,7},7);
    }
}
