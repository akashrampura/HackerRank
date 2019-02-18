package com.practice;

public class BruteForceStringMatch {

	public static void stringMatch(String text, String pattern) {
		int textLength = text.length();
		int patternLength = pattern.length();
		Boolean match = false;
		for (int i = 0; i <= textLength - patternLength; i++) {
			String subString = text.substring(i, i + patternLength);
			if (subString.equals(pattern)) {
				match = true;
				System.out.println("Pattern found at index : " + i);
			}
		}
		if(!match) {
			System.out.println("Pattern NOT found at index ");
		}
	}

	public static void main(String[] args) {
		String text = "gcagtacgcagagagtatacagtacg";
		String pattern = "agtacg";
		stringMatch(text, pattern);
		
		//Test case 2
		System.out.println("Test Case 2 : ");
		String text2 = "gcagtacgcagagagtatacagtacg";
		String pattern2 = "mnop";
		stringMatch(text2, pattern2);
	}
}
