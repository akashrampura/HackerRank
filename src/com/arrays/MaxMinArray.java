package com.arrays;

public class MaxMinArray {
	
	
	public static void maxMin(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		//max = IntStream.of(arr).max().getAsInt();
		//min = IntStream.of(arr).min().getAsInt();
		
		System.out.println("Max: "+max+" Min: "+min);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,66,7,8,9,3,4,0};
		maxMin(arr);
		
	}

}
