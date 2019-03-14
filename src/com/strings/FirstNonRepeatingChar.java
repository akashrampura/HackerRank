package com.strings;

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
	            if (count[str.charAt(i)] == 1) 
	            { 
	                index = i; 
	                break; 
	            }    
	        }

	      return index;
	}

	public static void main(String[] args) {
		 String str = "geeksforgeeks";
		firstNonRepeating(str);

	    }

}
