package com.hackerrank;

import java.util.Arrays;

public class Google {
	
	public static int findMinChairs(int[] S, int[] E) {
		
		int result = 1, chairs = 1;
		int i = 1 , j = 0;
		Arrays.sort(S);
		Arrays.sort(E);
		System.out.println(Arrays.toString(S));
		System.out.println(Arrays.toString(E));
		
		while(i<S.length && j<S.length) {
			System.out.println((S[i]));
			System.out.println((E[j]));
			if(S[i]<E[j]) {
				i++;
				chairs++;
				if(chairs>result) {
					result = chairs;
				}
			}
			else if(S[i]==E[j]) {
				j++;
			}
			else {
				j++;
				chairs--;
			}
			System.out.println("chairs :"+ chairs);
			
		}
		return result;
		
	}
	
	public static int closestDevice(int K, int[] X, int[] Y) {
		
		int result = 0;
		int i = 0 ;
		double[] arr = new double[X.length];
		while(i<X.length) {
			//arr[i] = X[i]*X[i]+Y[i]*Y[i];
			arr[i] = Math.pow(X[i], 2)+Math.pow(Y[i], 2);
			i++;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		result = (int) Math.ceil(Math.sqrt(arr[K-1]));
		return result;
		
	}
	
	public static void main(String[] args) {
		
		 int S[] = {1, 2, 6, 5, 3}; 
		 int E[] = {5, 5, 7, 6, 8}; 
		 System.out.println("Minimum Number of Chairs Required = "
		                        + findMinChairs(S, E)); 
		 int K = 4;
		 int[] X = {-1,2,-4,2,4};
		 int[] Y = {1,2,-4,2,-1};
		 System.out.println("Minimum Distance Required = "
                 + closestDevice(K, X, Y)); 
		 
	}
}
