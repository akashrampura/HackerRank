package com.bloomberg;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(target == sum) return new int[]{left, right};
            if(target > sum){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{left, right};

    }
}
