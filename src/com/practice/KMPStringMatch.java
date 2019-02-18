package com.practice;

public class KMPStringMatch {
	
	public static void kmpSearch(String pattern, String text) { 
        // creating longestPrefixSuffixArr[] that will hold the longest prefix ,suffix values for pattern 
        int longestPrefixSuffixArr[] = new int[pattern.length()]; 
        int j = 0; // index for pattern[] 
  
        // Preprocess the pattern (calculate lps[] array)
        computeLPSArray(pattern,longestPrefixSuffixArr); 
  
        int i = 0; // index for text[] 
        while (i < text.length()) { 
            if (pattern.charAt(j) == text.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == pattern.length()) { 
                System.out.println("Found pattern "
                                   + "at index " + (i - j)); 
                j = longestPrefixSuffixArr[j - 1]; 
            } 
            // mismatch after j matches 
            else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) { 
                // Do not match lps[0..lps[j-1]] characters, 
                // they will match anyway 
                if (j != 0) 
                    j = longestPrefixSuffixArr[j - 1]; 
                else
                    i = i + 1; 
            } 
        } 
    } 
	
	public static void computeLPSArray(String pattern, int longestPrefixSuffixArr[]) { 
        // length of the previous longest prefix suffix 
        int len = 0; 
        int i = 1; 
        longestPrefixSuffixArr[0] = 0; // longestPrefixSuffixArr[0] is always 0 
        // the loop calculates lps[i] for i = 1 to M-1 
        while (i < pattern.length()) { 
            if (pattern.charAt(i) == pattern.charAt(len)) { 
                len++; 
                longestPrefixSuffixArr[i] = len; 
                i++; 
            } 
            else { // (pattern[i] != pattern[len]) 
                if (len != 0) { 
                    len = longestPrefixSuffixArr[len - 1]; 
  
                    // Also, note that we do not increment 
                    // i here 
                } 
                else { // if (len == 0) 
                	longestPrefixSuffixArr[i] = len; 
                    i++; 
                } 
            } 
        } 
    } 

	public static void main(String[] args) {
		
		String text = "gcagtacgcagagagtatacagtacg";
		String pattern = "agtacg";
		kmpSearch(pattern, text);

	}

}
