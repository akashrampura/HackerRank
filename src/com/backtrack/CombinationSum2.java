package com.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result =  new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, list, result, 0);
        System.out.println(result);
        return result;
    }
    public void dfs(int[] candidates, int target, List<Integer> list, List<List<Integer>> result, int start){
        if(target < 0) return;
        if(target == 0) result.add(new ArrayList<>(list));

            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i - 1]) continue;
                list.add(candidates[i]);
                dfs(candidates, target - candidates[i], list, result, i + 1);
                list.remove(list.size() - 1);
            }

    }

    public static void main(String[] args) {
        CombinationSum2  cs = new CombinationSum2();
        cs.combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }
}
