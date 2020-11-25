package com.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, list, result, 0);
        System.out.println(result);
        return result;
    }
    public void dfs(int[] nums, List<Integer> list, List<List<Integer>> result, int start){
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            dfs(nums, list, result, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets2 subsets2 = new Subsets2();
        subsets2.subsetsWithDup(new int[]{2,2,1});
    }
}
