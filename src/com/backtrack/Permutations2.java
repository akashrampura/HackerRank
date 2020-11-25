package com.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        dfs(nums, list, result, used);
        System.out.println(result);
        return result;
    }
    public void dfs(int[] nums, List<Integer> list, List<List<Integer>> result, boolean[] used){
        if(list.size() == nums.length) result.add(new ArrayList<>(list));
        else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
                used[i] = true;
                list.add(nums[i]);
                dfs(nums, list, result, used);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Permutations2 p = new Permutations2();
        p.permute(new int[]{1,1,2});
    }
}
