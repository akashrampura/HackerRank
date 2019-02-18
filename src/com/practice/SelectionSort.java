package com.practice;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] intArr) {
		int temp,pos;
		for (int i = 0; i < intArr.length; i++) {
			pos = i;
			for (int j = i+1; j < intArr.length; j++) {
				if(intArr[j]<intArr[pos]) {
					pos = j;
				}
			}
			//swap
			temp = intArr[i];
			intArr[i] = intArr[pos];
			intArr[pos] = temp;
		}
		System.out.println(Arrays.toString(intArr));
		
	}
	
	
	
	 public static void main(String[] args)
	    {
	        selectionSort(new int[] {45, 84, 101, 62, 12, 45});
	 
	        selectionSort(new int[] {62, -45, 14, 8, -52, 45});
	 
	        selectionSort(new int[] {21, 12, 56, -48, 15, 45});
	    }

}
