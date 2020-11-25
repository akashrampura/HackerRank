package com.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    // [1,2,3] -> [],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, list, result, 0);
        System.out.println(result);
        return result;
    }
    public void dfs(int[] nums, List<Integer> list, List<List<Integer>> result, int start){
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            dfs(nums,list,result,i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets subset = new Subsets();
        subset.subsets(new int[]{3,2,1});
    }
}
