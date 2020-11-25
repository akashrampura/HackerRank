package com.strings;

import java.util.Arrays;
import java.util.Map;

public class FirstNonRepeatingChar {
	
	static final int NO_CHARS = 256;
	static char count[] = new char[NO_CHARS];

	public static int firstNonRepeating(String str) {
		for (int i = 0; i < str.length();  i++) {
        	count[str.charAt(i)]++;

        }


		 int index = -1;
	       
	        for (int i = 0; i < str.length();  i++) 
	        {
				System.out.println(count[str.charAt(i)]);

	            if (count[str.charAt(i)] == 1) 
	            { 
	                index = i; 
	                break; 
	            }    
	        }

	      return index;
	}

	public static int firstUniqChar(String s) {
		int freq [] = new int[26];
		for(int i = 0; i < s.length(); i ++)
			freq [s.charAt(i) - 'a'] ++;
		System.out.println(Arrays.toString(freq));
		for(int i = 0; i < s.length(); i ++)
			if(freq [s.charAt(i) - 'a'] == 1)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		 String str = "bb";
		//firstNonRepeating(str);
		System.out.println(firstUniqChar(str));
		int[] a = new int[26];

	    }
}
