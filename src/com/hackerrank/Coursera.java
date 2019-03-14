package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Coursera {

	public static void main(String[] args) {
		List<String> letter = new ArrayList<String>();
		letter.add("3");
		letter.add("abc");
		letter.add("abcba");
		letter.add("abcd");
		
mystery(letter);
		
	}
	
	public static List<Integer> mystery(List<String> letter) {
	    // Write your code here
	        System.out.println(letter);
	    List<Integer> result = new ArrayList<>();
	    
	        Integer T = Integer.parseInt(letter.get(0));
	    
	    
	        int count = 0;
	        for (int i = 0; i < T; i++) {
	            count = 0;
	            String s = letter.get(i+1);
	            char[] s_letters = s.toCharArray();
	            int a = 0;
	            int b = s_letters.length - 1;
	            while (a < b) {
	                if (s_letters[a] != s_letters[b]) {
	                    int temp = Math.abs(s_letters[a] - s_letters[b]);
	                    count = count + temp;
	                    
	                }
	                a++;
	                b--;
	            }
	            result.add(count);
	            System.out.println(count);
	            
	        }
	        System.out.println(result);
	        return result;
	    }

}
