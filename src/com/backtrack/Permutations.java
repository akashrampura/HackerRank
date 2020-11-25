package com.backtrack;

import com.arrays.Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, list, result);
        System.out.println(result);
        return result;
    }
    public void dfs(int[] nums, List<Integer> list, List<List<Integer>> result){
        if(list.size() == nums.length) result.add(new ArrayList<>(list));
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            dfs(nums, list, result);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations p = new Permutations();
        p.permute(new int[]{1,2,3});
    }
}
