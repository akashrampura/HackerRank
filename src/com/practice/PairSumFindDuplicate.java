package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PairSumFindDuplicate {

	public static void pairSum(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// System.out.println("i: "+arr[i]+" j: "+arr[j]);
				if (arr[i] + arr[j] == sum) {
					System.out.println("Pairs: " + arr[i] + ", " + arr[j]);
				}

			}
		}
	}

	public static void printRepeating(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		boolean dup = false;
		for (int i : arr) {
			if(map.containsKey(i)) {
				count = map.get(i);
				map.put(i, count+1);
			}
			else {
				map.put(i, 1);
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				dup = true;
				System.out.println("Duplicates are : "+entry.getKey());
			}
			
		}
		if(!dup) {
			System.out.println("No duplicates are present");
		}
	}
	

	public static void main(StringTest[] args) {
		int[] arr = { 3, 4,3, 5, 2, 8, -1, 1, 4, 2, 5, 6, 3, 0, 7 };

		// pairSum(arr, 7);
		printRepeating(arr);
		String str = "viijayv";
		//duplicate(str);

	}

}
