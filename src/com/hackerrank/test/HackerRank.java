package com.hackerrank.test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HackerRank {
	
	static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        System.out.println(Arrays.toString(ar));
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n-1;i++){
        	if(set.contains(ar[i])) {
        		System.out.println(ar[i]);
        		result++;
        		set.remove(ar[i]);
        	}
        	else {
        		System.out.println("else "+ar[i]);
        		set.add(ar[i]);
        	}
        	
        }
          return result;  
        }
	static int countingValleys(int n, String s) {
        int level = 0;
        int valley = 0;
        char[] charArr = s.toCharArray();
        for(Character c : charArr){
            if(c=='U'){
                level++;
            }
            if(c=='D'){
                level--;
            }
            if(level==0 && c=='U'){
                valley++;
            }
        }
        return valley;


    }
	
	 static int jumpingOnClouds(int[] c) {
	        int result = 0;
	        if( c[c.length-2]==0 && c[c.length-1]==0) {
    			result++;
    	}
	        for(int i=2;i<c.length;i+=2){
	        	//System.out.println(i);
	        	
	        	if(c[i]%2==0 && c[i]==0) {
	        		result++;
	        		
	        	}
	        	else {
	        		i=i-1;
	        		result++;
	        		
	        	}
	        }

	        return result;

	    }
	 // Complete the repeatedString function below.
	    static long repeatedString(String s, long n) {

	        long result = 0;

	        String s_new = "";
	        for (int i=0; i<n;i++){
	            s_new+=s;
	            System.out.println(s_new.length());
	            
	        }
	        s_new = s_new.substring(0,(int)n);
	        for(Character c: s_new.toCharArray()) {
	        	if(c=='a') {
	        		result++;
	        	}
	        }

	        return result;

	    }
	    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

	        List<Integer> resultList = new ArrayList<>();
	        Integer a_score = 0;
	        Integer b_score = 0;
	        System.out.println(b.size());
	        for(int i=0;i<a.size();i++){
	        	System.out.println(b.get(i));
	            if(a.get(i)>b.get(i)) {
	            	a_score++;
	            }
	            else if(a.get(i)<b.get(i)) {
	            	b_score++;
	            }
	        }
	        resultList.add(a_score);
	        resultList.add(b_score);

	        return resultList;

	    }
	    static int diagonalDifference(int[][] arr) {
	    	
	    	int result = 0;
	    	int d1 = 0;
	    	int d2 = 0;
	    	for(int i=0;i<arr.length;i++) {
	    		for(int j=0; j<arr.length;j++) {
	    			if(i==j) {
	    				d1 += arr[i][j];
	    			}
	    			if(i==arr.length-j-1) {
	    				System.out.println(arr[i][j]);
	    				d2 += arr[i][j];
	    			}
	    		}
	    	}
	    	for(int i=0;i<arr.length;i++) {
	    		d1 += arr[i][i];
	    		d2 += arr[i][arr.length-i-1];
	    	}
	    		
	    	result = Math.abs(d2-d1);
	    	System.out.println(result);
	    	return result;
	    }
	    
	    static void plusMinus(int[] arr) {
	    	DecimalFormat df = new DecimalFormat("0.000000");
	    	double p = 0;
	    	double n = 0;
	    	double z = 0;
	        for(int i=0; i<arr.length;i++){
	            if(arr[i]>0){
	                p++;
	            }
	            else if(arr[i]<0){
	                n++;
	            }
	            else{
	                z++;
	            }
	        }
	        System.out.println(p+" "+n+" "+z);
	            System.out.println(df.format(p/arr.length)+
	            		" "+df.format(n/arr.length)+"\n"+df.format(z/arr.length));

	        }
	    static void staircase(int n) {
	    	
	    	StringBuffer sb = new StringBuffer();
	    	String hash =  "#";
	    	String space = repeat(n);
    		sb = sb.insert(0, space);
    		StringBuffer regex = new StringBuffer();
    		String sp = "";
    		for(int i=n-1;i>=0;i--) {
	    		sb = sb.insert(i,hash);
	    		String s = sb.toString();
	    		s = s.replaceAll("(\\s+)","");
	    		sp += " ";
	    		//sb = sb.insert(0,sp);
	    		System.out.println(sb);
	    		
	    	}
    		
	    }
	    static String repeat(int n) {
	    	String s = "";
	    	for(int i=0;i<n;i++) {
	    		s += " ";
	    	}
	    	
	    	return s;
	    }
	    static void miniMaxSum(int[] arr) {

	        Arrays.sort(arr);
	        long minSum = 0;
	        long maxSum = 0;
	        for(int i=0;i<arr.length;i++){
	            if(i!=arr.length-1){
	                minSum += arr[i];
	            }
	            if(i!=0){
	                maxSum += arr[i];
	            }
	            
	        }
	        System.out.println(minSum+" "+maxSum);


	    }
	    static String timeConversion(String s) {
	         String time = "";
	         if(s.contains("PM")){
	             //19:05:45() 07:05:45PM
	             String[] srr = s.split(":");
	             Integer hr = Integer.valueOf(srr[0]);
	             if(hr!=12) {
	            	 hr = hr + 12;
	             }
	             srr[0] = hr.toString();
	             time = Arrays.toString(srr)
	            		 .replaceAll("\\[", "")
	            		 .replaceAll("\\]", "")
	            		 .replaceAll("PM", "")
	            		 .replaceAll(", ", ":");
	         }
	         if(s.contains("AM")){
	             //19:05:45() 07:05:45PM
	             String[] srr = s.split(":");
	             Integer hr = Integer.valueOf(srr[0]);
	             if(hr==12) {
	            	 hr = 0;
	             }
	             srr[0] = "0"+hr.toString();
	             time = Arrays.toString(srr)
	            		 .replaceAll("\\[", "")
	            		 .replaceAll("\\]", "")
	            		 .replaceAll("AM", "")
	            		 .replaceAll(", ", ":");
	         }
	         
	         System.out.println(time);
	         return time;

	    }
	    static int divisibleSumPairs(int n, int k, int[] ar) {

	        int result = 0;
	        for(int i=0;i<ar.length;i++){
	            for(int j=i+1;j<ar.length;j++){
	            	if((ar[i]+ar[j])%k==0) {
	            		result++;
	            	}
	            }
	        }
	        System.out.println(result);
	        return result;


	    }
	    static int migratoryBirds(List<Integer> arr) {
	    	
	    	int result = 0;
	    	Collections.sort(arr);
	    	Collections.reverse(arr);
	    	Set<Integer> set = new HashSet<>();
	    	Map<Integer, Integer> map = new HashMap<>();
	    	for(Integer i : arr) {
	    		if(map.containsKey(i)) {
	    			int x = map.get(i) + 1;
	    			map.put(i, x);
	    		}
	    		else {
	    			map.put(i, 1);
	    		}
	    		
	    	}
	    	System.out.println(map);
	    	int max = -1;
	    	Entry<Integer, Integer> maxEntry = null;
	    	for(Entry<Integer, Integer> entry: map.entrySet()) {
	    		System.out.println(entry.getValue());
	    		if(entry.getValue()>max) {
	    			max = entry.getValue();
	    			maxEntry = entry;
	    		}
	    	}
	    	System.out.println("Freq : "+maxEntry.getKey());
	    	return result;
	    }
	public static void main(String[] args) {
		
		//System.out.println(sockMerchant(10,arr));
		int[] c = {0, 1 ,0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0,
				1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1,
				0 ,0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 
				0 ,1 ,0,
				1, 0, 0 ,0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0,
				1 ,0 ,1, 
				0 ,1 ,0 ,0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
		 int arr[][] = 
		        { 
		            {11, 2, 4}, 
		            {4 , 5, 6}, 
		            {10, 8, -12} 
		        }; 
		//diagonalDifference(arr);
		 int ar[] = {1 ,3 ,2 ,6 ,1 ,2};
		 //plusMinus(ar);
		 //staircase(4);
		 int[] array = {
				 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
		 //miniMaxSum(array);
		 //timeConversion("06:40:03AM");
		 
		 //divisibleSumPairs(6,3,ar);
		 List<Integer> list = new ArrayList<>();
		 list.add(1);
		 list.add(4);
		 list.add(4);
		 list.add(4);
		 list.add(5);
		 list.add(3);
		 migratoryBirds(list);
	}
	
	

}
