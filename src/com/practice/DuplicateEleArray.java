package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateEleArray {
	
	
	public static int[] duplicate(int[] arr) {
		
		int[] count = new int[256];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(count[arr[i]]>1) {
				list.add(arr[i]);
			}
			
		}
		return list.stream().mapToInt(i->i).toArray();
		
	}
	

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,3,4,5,66,66,7,7,9};
		System.out.println(Arrays.toString(duplicate(arr)));

		

	}

}
